package com.calyrsoft.ucbp1

import androidx.compose.ui.graphics.vector.ImageVector
import com.calyrsoft.ucbp1.vectorucb.Android
import com.calyrsoft.ucbp1.vectorucb.AndroidBionic
import kotlin.collections.List as ____KtList

public object VectorUCB

private var __AllIcons: ____KtList<ImageVector>? = null

public val VectorUCB.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Android, AndroidBionic)
    return __AllIcons!!
  }
