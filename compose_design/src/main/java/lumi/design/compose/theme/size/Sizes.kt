package lumi.design.compose.theme.size

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Sizes(
    val spacing_small: Dp = 4.dp,
    val spacing_normal: Dp = 8.dp,
    val spacing_medium: Dp = 12.dp,

    val border_width: Dp = 0.5.dp,
)