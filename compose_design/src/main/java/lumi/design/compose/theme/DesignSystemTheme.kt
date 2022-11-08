package lumi.design.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import lumi.design.compose.theme.color.ColorPalette
import lumi.design.compose.theme.color.DarkColorPalette
import lumi.design.compose.theme.color.LightColorPalette
import lumi.design.compose.theme.size.Sizes
import lumi.design.compose.theme.typhography.TypeSystem
import lumi.design.compose.theme.typhography.font.fontFamily

val LocalColorPalette = staticCompositionLocalOf { LightColorPalette }

val LocalTypeSystem = staticCompositionLocalOf { TypeSystem(textColor = Color.Unspecified) }

val LocalSizeSystem = staticCompositionLocalOf { Sizes() }

object DesignSystemTheme {
    val colorPalette: ColorPalette
        @Composable
        get() = LocalColorPalette.current

    val typeSystem: TypeSystem
        @Composable
        get() = LocalTypeSystem.current

    val sizes: Sizes
        @Composable
        get() = LocalSizeSystem.current
}

@Composable
fun DesignSystemTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val replacementPalette = if (isDarkTheme) DarkColorPalette else LightColorPalette
    val replacementTypeSystem = TypeSystem(replacementPalette.textPrimaryColor)

    CompositionLocalProvider(
        LocalColorPalette provides replacementPalette,
        LocalTypeSystem provides replacementTypeSystem
    ) {
        MaterialTheme(
            colors = DesignSystemTheme.colorPalette.materialColors,
            typography = Typography(fontFamily),
            shapes = MaterialTheme.shapes.copy(
                small = RoundedCornerShape(3.dp),
                medium = RoundedCornerShape(0.dp),
                large = RoundedCornerShape(0.dp)
            ),
            content = content,
        )
    }
}
