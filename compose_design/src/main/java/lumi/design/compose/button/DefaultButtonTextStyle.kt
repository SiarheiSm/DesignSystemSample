package lumi.design.compose.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import lumi.design.compose.theme.DesignSystemTheme

@Composable
fun defaultButtonTextStyle(color: Color): TextStyle {
    return DesignSystemTheme.typeSystem.button.copy(color)
}

@Composable
fun defaultButtonContentPadding() = PaddingValues(12.dp, 9.dp, 12.dp, 9.dp)
