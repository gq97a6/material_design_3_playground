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
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.example.design.Theme
import com.google.android.material.color.utilities.Hct
import com.google.android.material.color.utilities.TonalPalette

val cs: ColorScheme
    @Composable
    get() = MaterialTheme.colorScheme

fun Color.toTonalList(): List<Color> {
    return TonalPalette.fromInt(this.toArgb()).let { palette ->
        List(101) {
            Color(palette.tone(it))
        }
    }
}

fun TonalPalette.toTonalList(): List<Color> {
    return List(101) {
        Color(this.tone(it))
    }
}

fun Color.hue(value: Double): Color {
    return Hct.fromInt(this.toArgb()).apply {
        hue = value
    }.toInt().let { Color(it) }
}

fun Color.chroma(value: Double): Color {
    return Hct.fromInt(this.toArgb()).apply {
        chroma = value
    }.toInt().let { Color(it) }
}

fun Color.tone(value: Double): Color {
    return Hct.fromInt(this.toArgb()).apply {
        tone = value
    }.toInt().let { Color(it) }
}

fun Color.hue(fraction: Float): Color {
    return Hct.fromInt(this.toArgb()).apply {
        hue = hue * fraction
    }.toInt().let { Color(it) }
}

fun Color.chroma(fraction: Float): Color {
    return Hct.fromInt(this.toArgb()).apply {
        chroma = chroma * fraction
    }.toInt().let { Color(it) }
}

fun Color.tone(fraction: Float): Color {
    return Hct.fromInt(this.toArgb()).apply {
        tone = tone * fraction
    }.toInt().let { Color(it) }
}


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

fun ColorScheme.modified(
    primary: Color = this.primary,
    onPrimary: Color = this.onPrimary,
    primaryContainer: Color = this.primaryContainer,
    onPrimaryContainer: Color = this.onPrimaryContainer,
    inversePrimary: Color = this.inversePrimary,
    secondary: Color = this.secondary,
    onSecondary: Color = this.onSecondary,
    secondaryContainer: Color = this.secondaryContainer,
    onSecondaryContainer: Color = this.onSecondaryContainer,
    tertiary: Color = this.tertiary,
    onTertiary: Color = this.onTertiary,
    tertiaryContainer: Color = this.tertiaryContainer,
    onTertiaryContainer: Color = this.onTertiaryContainer,
    background: Color = this.background,
    onBackground: Color = this.onBackground,
    surface: Color = this.surface,
    onSurface: Color = this.onSurface,
    surfaceVariant: Color = this.surfaceVariant,
    onSurfaceVariant: Color = this.onSurfaceVariant,
    surfaceTint: Color = this.surfaceTint,
    inverseSurface: Color = this.inverseSurface,
    inverseOnSurface: Color = this.inverseOnSurface,
    error: Color = this.error,
    onError: Color = this.onError,
    errorContainer: Color = this.errorContainer,
    onErrorContainer: Color = this.onErrorContainer,
    outline: Color = this.outline,
    outlineVariant: Color = this.outlineVariant,
    scrim: Color = this.scrim,
    surfaceBright: Color = this.surfaceBright,
    surfaceDim: Color = this.surfaceDim,
    surfaceContainer: Color = this.surfaceContainer,
    surfaceContainerHigh: Color = this.surfaceContainerHigh,
    surfaceContainerHighest: Color = this.surfaceContainerHighest,
    surfaceContainerLow: Color = this.surfaceContainerLow,
    surfaceContainerLowest: Color = this.surfaceContainerLowest,
    primaryFixed: Color = this.primaryFixed,
    primaryFixedDim: Color = this.primaryFixedDim,
    onPrimaryFixed: Color = this.onPrimaryFixed,
    onPrimaryFixedVariant: Color = this.onPrimaryFixedVariant,
    secondaryFixed: Color = this.secondaryFixed,
    secondaryFixedDim: Color = this.secondaryFixedDim,
    onSecondaryFixed: Color = this.onSecondaryFixed,
    onSecondaryFixedVariant: Color = this.onSecondaryFixedVariant,
    tertiaryFixed: Color = this.tertiaryFixed,
    tertiaryFixedDim: Color = this.tertiaryFixedDim,
    onTertiaryFixed: Color = this.onTertiaryFixed,
    onTertiaryFixedVariant: Color = this.onTertiaryFixedVariant
): ColorScheme = ColorScheme(
    primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary,
    secondary, onSecondary, secondaryContainer, onSecondaryContainer,
    tertiary, onTertiary, tertiaryContainer, onTertiaryContainer,
    background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant,
    surfaceTint, inverseSurface, inverseOnSurface, error,
    onError, errorContainer, onErrorContainer, outline, outlineVariant,
    scrim, surfaceBright, surfaceDim, surfaceContainer, surfaceContainerHigh,
    surfaceContainerHighest, surfaceContainerLow, surfaceContainerLowest, primaryFixed,
    primaryFixedDim, onPrimaryFixed, onPrimaryFixedVariant, secondaryFixed,
    secondaryFixedDim, onSecondaryFixed, onSecondaryFixedVariant, tertiaryFixed,
    tertiaryFixedDim, onTertiaryFixed, onTertiaryFixedVariant
)