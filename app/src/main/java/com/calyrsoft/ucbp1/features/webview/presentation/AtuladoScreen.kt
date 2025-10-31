package com.calyrsoft.ucbp1.features.webview.presentation

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.view.ViewGroup
import android.webkit.*
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.viewinterop.AndroidView
import kotlinx.coroutines.*
import java.nio.charset.StandardCharsets

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("SetJavaScriptEnabled")
@Composable
fun AtuladoScreen(
    url: String,
    postData: String?,
    shouldStopBrowsing: (String?) -> Boolean,
    modifier: Modifier
) {
    val webView = remember { mutableStateOf<WebView?>(null) }
    var canGoBack by remember { mutableStateOf(false) }
    var navigateBack by remember { mutableStateOf(false) }

    // NUEVO: control del mensaje de timeout
    var showTimeoutAlert by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()

    BackHandler(enabled = true) { }

    // Timeout solo al cargar la página inicial
    LaunchedEffect(Unit) {
        coroutineScope.launch {
            try {
                // Espera máximo 2 segundos a que la página termine de cargar
                withTimeout(2000L) {
                    while (webView.value?.progress ?: 0 < 100) {
                        yield() // no bloquea la UI
                    }
                }
            } catch (_: TimeoutCancellationException) {
                showTimeoutAlert = true
            }
        }
    }

    LaunchedEffect(navigateBack) {
        if (navigateBack) {
            val currentWebView = webView.value
            if (currentWebView != null && currentWebView.canGoBack()) {
                currentWebView.goBack()
            }
        }
        navigateBack = false
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Onboarding") },
                navigationIcon = {
                    if (canGoBack) {
                        IconButton(onClick = { navigateBack = true }) {
                            Text("Back")
                        }
                    }
                }
            )
        },
        content = { paddingValues ->
            AndroidView(
                modifier = modifier.fillMaxSize().padding(paddingValues),
                factory = { it ->
                    WebView(it).apply {
                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT
                        )

                        settings.apply {
                            loadWithOverviewMode = true
                            isFocusable = true
                            isFocusableInTouchMode = true
                            useWideViewPort = true
                            javaScriptEnabled = true
                            cacheMode = WebSettings.LOAD_NO_CACHE
                        }

                        webViewClient = object : WebViewClient() {
                            override fun onPageStarted(
                                view: WebView,
                                url: String?,
                                favicon: Bitmap?
                            ) {
                                view.settings.setSupportZoom(false)
                            }

                            override fun onReceivedError(
                                view: WebView?,
                                request: WebResourceRequest?,
                                error: WebResourceError?,
                            ) {
                                super.onReceivedError(view, request, error)
                                println("onReceivedError: ${error?.description}")
                            }

                            override fun onPageFinished(view: WebView?, url: String?) {
                                super.onPageFinished(view, url)
                                canGoBack = view?.canGoBack() == true
                                println("onPageFinished: $url")
                            }

                            override fun shouldOverrideUrlLoading(
                                view: WebView?,
                                request: WebResourceRequest?,
                            ): Boolean {
                                return if (shouldStopBrowsing(request?.url.toString())) true
                                else super.shouldOverrideUrlLoading(view, request)
                            }

                            override fun doUpdateVisitedHistory(
                                view: WebView?,
                                url: String?,
                                isReload: Boolean
                            ) {
                                super.doUpdateVisitedHistory(view, url, isReload)
                                canGoBack = view?.canGoBack() == true
                            }
                        }

                        if (postData != null) {
                            postUrl(url, postData.toByteArray(StandardCharsets.UTF_8))
                        } else {
                            loadUrl(url)
                        }
                        webView.value = this
                    }
                }
            )

            //  Mensaje visual del timeout (azul)
            if (showTimeoutAlert) {
                AlertDialog(
                    onDismissRequest = { showTimeoutAlert = false },
                    confirmButton = {
                        Button(
                            onClick = { showTimeoutAlert = false },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1565C0))
                        ) {
                            Text("Aceptar", color = Color.White)
                        }
                    },
                    title = { Text("Tiempo de espera agotado") },
                    text = { Text("La página inicial tardó demasiado en responder.") }
                )
            }
        }
    )
}
