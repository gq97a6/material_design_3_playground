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