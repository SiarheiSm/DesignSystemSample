package lumi.design.compose.theme.color

import androidx.compose.material.Colors
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class ColorPalette(
    val brandColor: Color,
    val brandSecondaryColor: Color,
    val accent: Color,
    val accentColor: Color,
    val errorColor: Color,
    val backgroundColor: Color,
    val textPrimaryColor: Color,
    val btnPrimaryColor: Color,
    val materialColors: Colors
)