package lumi.design.system

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import lumi.design.compose.button.PrimaryButton
import lumi.design.compose.text.body.Body1
import lumi.design.compose.text.headers.Headline1
import lumi.design.compose.theme.DesignSystemTheme

class MainActivityCompose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemeView()
        }
    }

    @Composable
    fun ThemeView() {
        DesignSystemTheme {
            Scaffold(
                backgroundColor = DesignSystemTheme.colorPalette.backgroundColor,
                content = {
                    Column(
                        modifier = Modifier.padding(it)
                    ) {
                        LayoutView()
                    }
                }
            )
        }
    }

    @Composable
    fun LayoutView() {
        Column(
            modifier = Modifier.padding(
                all = DesignSystemTheme.sizes.spacing_medium
            )
        ) {
            Headline1(
                stringResource(id = R.string.composeHeader),
                color = DesignSystemTheme.colorPalette.brandColor
            )
            Body1(stringResource(id = R.string.composeBody))
            OpenXmlButton()
        }
    }

    @Composable
    fun OpenXmlButton() {
        PrimaryButton(
            text = stringResource(id = R.string.openXml),
            onClick = {
                startActivity(Intent(baseContext, MainActivityXml::class.java))
            },
        )
    }
}