package lumi.design.compose.text.headers

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import lumi.design.compose.theme.DesignSystemTheme

/**
 * Typography Headline1, with the following properties:
 *  - Size: 20sp
 *  - Font: batonturbo_bold
 *  - Letter Spacing: -0.005
 *  - Line Height: 24dp
 */
@Composable
fun Headline1(
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
        style = DesignSystemTheme.typeSystem.headline1
    )
}
