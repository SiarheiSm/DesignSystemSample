package lumi.design.compose.text.body

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import lumi.design.compose.theme.DesignSystemTheme

/**
 * Typography Body1, with the following properties:
 *  - Size: 14sp
 *  - Font: batonturbo_regular
 *  - Letter Spacing: 0
 *  - Line Height: 16dp
 */
@Composable
fun Body2(
    text: String,
    modifier: Modifier = Modifier,
    textAlign: TextAlign? = null,
    color: Color = Color.Unspecified,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Ellipsis
) {
    Text(
        text = text,
        modifier = modifier,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overflow,
        style = DesignSystemTheme.typeSystem.body2
    )
}
