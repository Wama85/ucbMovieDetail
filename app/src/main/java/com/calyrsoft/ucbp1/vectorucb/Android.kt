package com.calyrsoft.ucbp1.vectorucb

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.calyrsoft.ucbp1.VectorUCB
import kotlin.Unit

public val VectorUCB.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF95CF00)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(29.727f, 9.601f)
                curveTo(28.935f, 9.601f, 28.295f, 8.977f, 28.295f, 8.207f)
                curveTo(28.295f, 7.436f, 28.935f, 6.815f, 29.727f, 6.815f)
                curveTo(30.519f, 6.815f, 31.159f, 7.436f, 31.159f, 8.207f)
                curveTo(31.159f, 8.977f, 30.519f, 9.601f, 29.727f, 9.601f)
                lineTo(29.727f, 9.601f)
                close()
                moveTo(18.273f, 9.601f)
                curveTo(17.481f, 9.601f, 16.841f, 8.977f, 16.841f, 8.207f)
                curveTo(16.841f, 7.436f, 17.481f, 6.815f, 18.273f, 6.815f)
                curveTo(19.065f, 6.815f, 19.705f, 7.436f, 19.705f, 8.207f)
                curveTo(19.705f, 8.977f, 19.065f, 9.601f, 18.273f, 9.601f)
                lineTo(18.273f, 9.601f)
                close()
                moveTo(30.574f, 4.019f)
                lineTo(31.107f, 3.234f)
                lineTo(31.641f, 2.461f)
                lineTo(32.83f, 0.722f)
                curveTo(32.978f, 0.508f, 32.917f, 0.22f, 32.696f, 0.079f)
                curveTo(32.479f, -0.065f, 32.18f, -0.006f, 32.038f, 0.209f)
                lineTo(30.223f, 2.853f)
                lineTo(29.678f, 3.649f)
                curveTo(27.952f, 2.997f, 26.03f, 2.633f, 24.0f, 2.633f)
                curveTo(21.973f, 2.633f, 20.048f, 2.997f, 18.322f, 3.649f)
                lineTo(17.78f, 2.853f)
                lineTo(17.244f, 2.071f)
                lineTo(15.968f, 0.209f)
                curveTo(15.82f, -0.006f, 15.524f, -0.062f, 15.304f, 0.079f)
                curveTo(15.086f, 0.22f, 15.025f, 0.508f, 15.17f, 0.722f)
                lineTo(16.359f, 2.461f)
                lineTo(16.893f, 3.234f)
                lineTo(17.429f, 4.019f)
                curveTo(13.378f, 5.856f, 10.638f, 9.336f, 10.638f, 13.318f)
                lineTo(37.362f, 13.318f)
                curveTo(37.362f, 9.336f, 34.622f, 5.856f, 30.574f, 4.019f)
                close()
                moveTo(10.844f, 15.175f)
                lineTo(10.638f, 15.175f)
                lineTo(10.638f, 35.613f)
                curveTo(10.638f, 37.236f, 11.992f, 38.557f, 13.662f, 38.557f)
                lineTo(15.843f, 38.557f)
                curveTo(15.768f, 38.802f, 15.727f, 39.059f, 15.727f, 39.33f)
                lineTo(15.727f, 45.214f)
                curveTo(15.727f, 46.753f, 17.012f, 48.0f, 18.592f, 48.0f)
                curveTo(20.172f, 48.0f, 21.457f, 46.753f, 21.457f, 45.214f)
                lineTo(21.457f, 39.33f)
                curveTo(21.457f, 39.059f, 21.413f, 38.802f, 21.341f, 38.557f)
                lineTo(26.659f, 38.557f)
                curveTo(26.587f, 38.802f, 26.546f, 39.059f, 26.546f, 39.33f)
                lineTo(26.546f, 45.214f)
                curveTo(26.546f, 46.753f, 27.828f, 48.0f, 29.408f, 48.0f)
                curveTo(30.991f, 48.0f, 32.276f, 46.753f, 32.276f, 45.214f)
                lineTo(32.276f, 39.33f)
                curveTo(32.276f, 39.059f, 32.232f, 38.802f, 32.157f, 38.557f)
                lineTo(34.341f, 38.557f)
                curveTo(36.011f, 38.557f, 37.362f, 37.236f, 37.362f, 35.613f)
                lineTo(37.362f, 15.175f)
                lineTo(10.844f, 15.175f)
                close()
                moveTo(5.865f, 15.175f)
                curveTo(4.282f, 15.175f, 3.0f, 16.422f, 3.0f, 17.96f)
                lineTo(3.0f, 29.884f)
                curveTo(3.0f, 31.422f, 4.282f, 32.67f, 5.865f, 32.67f)
                curveTo(7.445f, 32.67f, 8.727f, 31.422f, 8.727f, 29.884f)
                lineTo(8.727f, 17.96f)
                curveTo(8.727f, 16.422f, 7.445f, 15.175f, 5.865f, 15.175f)
                close()
                moveTo(42.138f, 15.175f)
                curveTo(40.555f, 15.175f, 39.273f, 16.422f, 39.273f, 17.96f)
                lineTo(39.273f, 29.884f)
                curveTo(39.273f, 31.422f, 40.555f, 32.67f, 42.138f, 32.67f)
                curveTo(43.718f, 32.67f, 45.0f, 31.422f, 45.0f, 29.884f)
                lineTo(45.0f, 17.96f)
                curveTo(45.0f, 16.422f, 43.718f, 15.175f, 42.138f, 15.175f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = VectorUCB.Android, contentDescription = "")
    }
}
