package lumi.design.compose.theme.color

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val White = Color(0xffffffff)
val Black = Color(0xff000000)

val GreyCold900 = Color(0xff212930)
val GreyCold800 = Color(0xff333D47)
val GreyCold600 = Color(0xff516272)
val GreyCold200 = Color(0xffAEB7C0)

val GreyNeutral900 = Color(0xff1E1D1D)
val GreyNeutral600 = Color(0xff656667)
val GreyNeutral200 = Color(0xffC4C7C9)
val GreyNeutral100 = Color(0xffDCDFE1)
val GreyNeutral50 = Color(0xffF4F7FA)

val Red900 = Color(0xffD30016)
val Red600 = Color(0xffFF0032)
val Red400 = Color(0xffFF3F50)

val Blue600 = Color(0xff412DEE)
val Blue400 = Color(0xff615CFF)

val ErrorRed900 = Color(0xffBC1526)
val ErrorRed400 = Color(0xffF3515A)

val LightColors = lightColors(
    primary = Black,
    primaryVariant = Red900,
    onPrimary = White,
    secondary = Blue400,
    secondaryVariant = Blue600,
    onSecondary = White,
    error = ErrorRed900,
    onError = White,
    background = GreyNeutral50,
    surface = White,
    onBackground = GreyCold800,
    onSurface = GreyCold800
)

val DarkColors = darkColors(
    primary = White,
    primaryVariant = Red600,
    onPrimary = GreyCold800,
    secondary = GreyNeutral100,
    secondaryVariant = Blue600,
    onSecondary = Black,
    error = ErrorRed400,
    onError = GreyCold900,
    background = GreyNeutral900,
    surface = GreyCold900,
    onBackground = GreyNeutral50,
    onSurface = GreyNeutral50
)
