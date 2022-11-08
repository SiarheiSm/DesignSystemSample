package lumi.design.compose.theme.typhography

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import lumi.design.compose.theme.typhography.font.fontFamily

@Immutable
data class TypeSystem(
    val headline1: TextStyle = defaultTextStyle(Color.Unspecified).copy(
        fontSize = 20.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-0.05).sp
    ),
    val headline2: TextStyle = defaultTextStyle(Color.Unspecified).copy(
        fontSize = 18.sp,
        lineHeight = 22.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.05).sp
    ),

    val body1: TextStyle = defaultTextStyle(Color.Unspecified).copy(
        fontSize = 16.sp,
        lineHeight = 18.sp,
    ),
    val body2: TextStyle = defaultTextStyle(Color.Unspecified).copy(
        fontSize = 14.sp,
        lineHeight = 16.sp
    ),
    val body3: TextStyle = defaultTextStyle(Color.Unspecified).copy(
        fontSize = 12.sp,
        lineHeight = 14.sp
    ),

    val button: TextStyle = defaultTextStyle(Color.Unspecified).copy(
        fontSize = 16.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.SemiBold
    ),
) {
    /**
     * Builds the design custom type system.
     * @return The design custom type system
     */
    constructor(textColor: Color) : this(
        headline1 = TypeSystem().headline1.copy(textColor),
        headline2 = TypeSystem().headline2.copy(textColor),
        body1 = TypeSystem().body1.copy(textColor),
        body2 = TypeSystem().body2.copy(textColor),
        body3 = TypeSystem().body3.copy(textColor),
        button = TypeSystem().button.copy(textColor),
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TypeSystem

        if (headline1 != other.headline1) return false
        if (headline2 != other.headline2) return false
        if (body2 != other.body2) return false
        if (body1 != other.body1) return false
        if (body3 != other.body3) return false
        if (button != other.button) return false

        return true
    }

    override fun hashCode(): Int {
        var result = headline1.hashCode()
        result = 31 * result + headline2.hashCode()
        result = 31 * result + body2.hashCode()
        result = 31 * result + body1.hashCode()
        result = 31 * result + body3.hashCode()
        result = 31 * result + button.hashCode()
        return result
    }
}

private fun defaultTextStyle(textColor: Color): TextStyle = TextStyle(
    fontFamily = fontFamily,
    fontSize = 14.sp,
    fontWeight = FontWeight.Normal,
    letterSpacing = 0.sp,
    color = textColor
)
