package com.compose.example

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.google.android.material.color.utilities.Contrast.darkerUnsafe
import com.google.android.material.color.utilities.Contrast.lighterUnsafe
import com.google.android.material.color.utilities.Hct
import kotlin.math.max
import kotlin.math.min

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

fun Color.adjust(background: Color): Color {
    val color = Hct.fromInt(this.toArgb())
    val hue = color.hue
    val chroma = color.chroma
    val tone = color.tone
    val backgroundTone = Hct.fromInt(background.toArgb()).tone

    //If background is dark get first lighter tone that meets contrast ratio requirement
    //If background is light get first darker tone that meets contrast ratio requirement
    //Use current tone if it meets contrast ratio requirement
    val resultTone = if (backgroundTone <= 50) max(tone, lighterUnsafe(backgroundTone, 2.0))
    else min(tone, darkerUnsafe(backgroundTone, 2.0))

    return Color(Hct.from(hue, chroma, resultTone).toInt())
}

@Suppress("ConstPropertyName", "unused")
object Tones {
    object Dark {
        // Primary
        const val primary = 40
        const val onPrimary = 100
        const val primaryContainer = 90
        const val onPrimaryContainer = 10
        const val inversePrimary = 80
        const val primaryFixed = 90
        const val primaryFixedDim = 80
        const val onPrimaryFixed = 10
        const val onPrimaryFixedVariant = 30

        // Secondary
        const val secondary = 40
        const val onSecondary = 100
        const val secondaryContainer = 90
        const val onSecondaryContainer = 10
        const val secondaryFixed = 90
        const val secondaryFixedDim = 80
        const val onSecondaryFixed = 10
        const val onSecondaryFixedVariant = 30

        // Tertiary
        const val tertiary = 40
        const val onTertiary = 100
        const val tertiaryContainer = 90
        const val onTertiaryContainer = 10
        const val tertiaryFixed = 90
        const val tertiaryFixedDim = 80
        const val onTertiaryFixed = 10
        const val onTertiaryFixedVariant = 30

        // Neutral
        const val background = 98
        const val onBackground = 10
        const val surface = 98
        const val onSurface = 10
        const val surfaceTint = 40
        const val inverseSurface = 20
        const val inverseOnSurface = 95
        const val scrim = 0
        const val surfaceBright = 98
        const val surfaceContainer = 94
        const val surfaceContainerHigh = 92
        const val surfaceContainerHighest = 90
        const val surfaceContainerLow = 96
        const val surfaceContainerLowest = 100
        const val surfaceDim = 87

        // NeutralVariant
        const val surfaceVariant = 90
        const val onSurfaceVariant = 30
        const val outline = 50
        const val outlineVariant = 80

        // Error
        const val error = 40
        const val onError = 100
        const val errorContainer = 90
        const val onErrorContainer = 10
    }

    object Light {
        // Primary
        const val primary = 80
        const val onPrimary = 20
        const val primaryContainer = 30
        const val onPrimaryContainer = 90
        const val inversePrimary = 40
        const val primaryFixed = 90
        const val primaryFixedDim = 80
        const val onPrimaryFixed = 10
        const val onPrimaryFixedVariant = 30

        // Secondary
        const val secondary = 80
        const val onSecondary = 20
        const val secondaryContainer = 30
        const val onSecondaryContainer = 90
        const val secondaryFixed = 90
        const val secondaryFixedDim = 80
        const val onSecondaryFixed = 10
        const val onSecondaryFixedVariant = 30

        // Tertiary
        const val tertiary = 80
        const val onTertiary = 20
        const val tertiaryContainer = 30
        const val onTertiaryContainer = 90
        const val tertiaryFixed = 90
        const val tertiaryFixedDim = 80
        const val onTertiaryFixed = 10
        const val onTertiaryFixedVariant = 30

        // Neutral
        const val background = 6
        const val onBackground = 90
        const val surface = 6
        const val onSurface = 90
        const val surfaceTint = 80
        const val inverseSurface = 90
        const val inverseOnSurface = 20
        const val scrim = 0
        const val surfaceBright = 24
        const val surfaceContainer = 12
        const val surfaceContainerHigh = 17
        const val surfaceContainerHighest = 22
        const val surfaceContainerLow = 10
        const val surfaceContainerLowest = 4
        const val surfaceDim = 6

        // NeutralVariant
        const val surfaceVariant = 30
        const val onSurfaceVariant = 80
        const val outline = 60
        const val outlineVariant = 30

        // Error
        const val error = 80
        const val onError = 20
        const val errorContainer = 30
        const val onErrorContainer = 90
    }
}