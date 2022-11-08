package lumi.design.compose.button

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import lumi.design.compose.theme.DesignSystemTheme

@Composable
fun PrimaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: String
) {
    PrimaryButton(onClick, modifier, enabled) {
        Text(
            text,
            style = defaultButtonTextStyle(DesignSystemTheme.colorPalette.materialColors.onSecondary)
        )
    }
}

@Composable
fun PrimaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable () -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = DesignSystemTheme.colorPalette.materialColors.secondary,
            disabledBackgroundColor = DesignSystemTheme.colorPalette.materialColors.primaryVariant
        ),
        modifier = modifier,
        contentPadding = defaultButtonContentPadding(),
        elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
        enabled = enabled,
        onClick = onClick,
        content = {
            ProvideTextStyle(
                value = defaultButtonTextStyle(DesignSystemTheme.colorPalette.materialColors.onSecondary),
                content = content
            )
        }
    )
}
