package com.compose.example

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.example.design.Theme

val cs: ColorScheme
    @Composable
    get() = MaterialTheme.colorScheme


@Composable
fun PreviewSample(content: @Composable () -> Unit) {
    Row {
        Theme(false) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                content()
            }
        }
        VerticalDivider()
        Theme(true) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                content()
            }
        }
    }
}

@Composable
fun PreviewSample(
    lightColorScheme: ColorScheme,
    darkColorScheme: ColorScheme,
    content: @Composable () -> Unit
) {
    Row {
        Theme(lightColorScheme) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                content()
            }
        }
        VerticalDivider()
        Theme(darkColorScheme) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                content()
            }
        }
    }
}

@Composable
fun RowScope.ColorSquare(
    background: Color,
    label: String
) {
    Column(
        Modifier
            .weight(1f)
            .fillMaxHeight()
            .padding(5.dp)
    ) {
        Text(label, fontSize = 8.sp, lineHeight = 8.sp, color = cs.onBackground)
        Box(
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(background)
        ) {}
    }
}

@Composable
fun RowScope.ColorDisplay(
    backgroundColor: Color,
    foregroundColor: Color,
    backgroundColorVariant: Color? = null,
    foregroundColorVariant: Color? = null,
    label: String,
) {
    Column(
        Modifier
            .weight(1f)
            .fillMaxHeight()
            .padding(5.dp)
    ) {
        Text(label, fontSize = 8.sp, lineHeight = 8.sp, color = cs.onBackground)
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(foregroundColor)
            ) {}
            if (foregroundColorVariant != null) Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(foregroundColorVariant)
            ) {}
        }

        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(backgroundColor)
        ) {}

        if (backgroundColorVariant != null) Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(backgroundColorVariant)
        ) {}
    }
}