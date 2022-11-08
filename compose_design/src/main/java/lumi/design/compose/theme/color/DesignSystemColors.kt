package lumi.design.compose.theme.color

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val LightColorPalette = createColorPalette(
    brandColor = Blue400,
    materialColors = LightColors
)

val DarkColorPalette = createColorPalette(
    brandColor = Red400,
    materialColors = DarkColors
)

private fun createColorPalette(
    brandColor: Color? = null,
    brandSecondaryColor: Color? = null,
    accent: Color? = null,
    accentColor: Color? = null,
    errorColor: Color? = null,
    backgroundColor: Color? = null,
    textPrimaryColor: Color? = null,
    btnPrimaryColor: Color? = null,
    materialColors: Colors
) = ColorPalette(
    brandColor = brandColor ?: materialColors.primary,
    brandSecondaryColor = brandSecondaryColor ?: materialColors.primaryVariant,
    accent = accent ?: materialColors.secondaryVariant,
    accentColor = accentColor ?: materialColors.secondaryVariant,
    errorColor = errorColor ?: materialColors.error,
    backgroundColor = backgroundColor ?: materialColors.background,
    textPrimaryColor = textPrimaryColor ?: materialColors.primary,
    btnPrimaryColor = btnPrimaryColor ?: materialColors.secondaryVariant,
    materialColors = materialColors,
)
