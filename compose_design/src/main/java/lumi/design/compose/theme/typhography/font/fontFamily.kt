package lumi.design.compose.theme.typhography.font

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import lumi.design.compose.R

private val regular: Font = Font(R.font.batonturbo_regular, FontWeight.Normal)
private val bold: Font = Font(R.font.batonturbo_bold, FontWeight.Bold)

val fontFamily: FontFamily = FontFamily(
    regular,
    bold
)
