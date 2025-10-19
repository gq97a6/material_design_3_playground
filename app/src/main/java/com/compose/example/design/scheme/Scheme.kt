package com.compose.example.design.scheme

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color
import com.compose.example.adjust
import com.compose.example.chroma
import com.compose.example.design.error
import com.compose.example.design.neutral
import com.compose.example.design.neutralVariant
import com.compose.example.design.primary
import com.compose.example.design.secondary
import com.compose.example.design.tertiary
import com.compose.example.tone

//Custom light color scheme
val lightColorScheme = ColorScheme(
    // Primary
    primary = primary.adjust(Color.White).chroma(.9f),
    onPrimary = primary.tone(98.0).chroma(0f),
    primaryContainer = primary.tone(80.0).chroma(0f),
    onPrimaryContainer = primary.tone(10.0).chroma(0f),
    inversePrimary = primary.adjust(Color.White),
    primaryFixed = Color.Unspecified,
    primaryFixedDim = Color.Unspecified,
    onPrimaryFixed = Color.Unspecified,
    onPrimaryFixedVariant = Color.Unspecified,

    // Secondary
    secondary = secondary.tone(20.0).chroma(0f),
    onSecondary = secondary.tone(100.0).chroma(0f),
    secondaryContainer = secondary.tone(90.0).chroma(0f),
    onSecondaryContainer = secondary.tone(10.0).chroma(0f),
    secondaryFixed = Color.Unspecified,
    secondaryFixedDim = Color.Unspecified,
    onSecondaryFixed = Color.Unspecified,
    onSecondaryFixedVariant = Color.Unspecified,

    // Tertiary
    tertiary = tertiary.tone(50.0),
    onTertiary = tertiary.tone(100.0),
    tertiaryContainer = tertiary.tone(90.0),
    onTertiaryContainer = tertiary.tone(10.0),
    tertiaryFixed = Color.Unspecified,
    tertiaryFixedDim = Color.Unspecified,
    onTertiaryFixed = Color.Unspecified,
    onTertiaryFixedVariant = Color.Unspecified,

    // Neutral
    background = neutral.tone(98.0),
    onBackground = neutral.tone(10.0),
    surface = neutral.tone(98.0),
    onSurface = neutral.tone(10.0),
    surfaceTint = neutral.tone(40.0),
    inverseSurface = neutral.tone(20.0),
    inverseOnSurface = neutral.tone(95.0),
    scrim = neutral.tone(0.0),
    surfaceBright = neutral.tone(98.0),
    surfaceContainer = neutral.tone(94.0),
    surfaceContainerHigh = neutral.tone(92.0),
    surfaceContainerHighest = neutral.tone(90.0),
    surfaceContainerLow = neutral.tone(96.0),
    surfaceContainerLowest = neutral.tone(100.0),
    surfaceDim = neutral.tone(87.0),

    // NeutralVariant
    surfaceVariant = neutralVariant.tone(90.0),
    onSurfaceVariant = neutralVariant.tone(30.0),
    outline = neutralVariant.tone(50.0),
    outlineVariant = neutralVariant.tone(80.0),

    // Error
    error = error.tone(50.0),
    onError = error.tone(100.0),
    errorContainer = error.tone(90.0),
    onErrorContainer = error.tone(10.0)
)

//Custom dark color scheme
val darkColorScheme = ColorScheme(
    // Primary
    primary = primary.adjust(Color.Black).chroma(.9f),
    onPrimary = primary.tone(10.0).chroma(0f),
    primaryContainer = primary.tone(10.0).chroma(0f),
    onPrimaryContainer = primary.tone(85.0).chroma(0f),
    inversePrimary = primary.adjust(Color.Black).tone(.9f),
    primaryFixed = Color.Unspecified,
    primaryFixedDim = Color.Unspecified,
    onPrimaryFixed = Color.Unspecified,
    onPrimaryFixedVariant = Color.Unspecified,

    // Secondary
    secondary = secondary.tone(80.0).chroma(0f),
    onSecondary = secondary.tone(20.0).chroma(0f),
    secondaryContainer = secondary.tone(30.0).chroma(0f),
    onSecondaryContainer = secondary.tone(90.0).chroma(0f),
    secondaryFixed = Color.Unspecified,
    secondaryFixedDim = Color.Unspecified,
    onSecondaryFixed = Color.Unspecified,
    onSecondaryFixedVariant = Color.Unspecified,

    // Tertiary
    tertiary = tertiary.tone(70.0),
    onTertiary = tertiary.tone(10.0),
    tertiaryContainer = tertiary.tone(30.0),
    onTertiaryContainer = tertiary.tone(90.0),
    tertiaryFixed = Color.Unspecified,
    tertiaryFixedDim = Color.Unspecified,
    onTertiaryFixed = Color.Unspecified,
    onTertiaryFixedVariant = Color.Unspecified,

    // Neutral
    background = neutral.tone(6.0),
    onBackground = neutral.tone(90.0),
    surface = neutral.tone(6.0),
    onSurface = neutral.tone(90.0),
    surfaceTint = neutral.tone(80.0),
    inverseSurface = neutral.tone(90.0),
    inverseOnSurface = neutral.tone(20.0),
    scrim = neutral.tone(0.0),
    surfaceBright = neutral.tone(24.0),
    surfaceContainer = neutral.tone(12.0),
    surfaceContainerHigh = neutral.tone(17.0),
    surfaceContainerHighest = neutral.tone(22.0),
    surfaceContainerLow = neutral.tone(10.0),
    surfaceContainerLowest = neutral.tone(4.0),
    surfaceDim = neutral.tone(6.0),

    // NeutralVariant
    surfaceVariant = neutral.tone(30.0),
    onSurfaceVariant = neutral.tone(80.0),
    outline = neutral.tone(60.0),
    outlineVariant = neutral.tone(30.0),

    // Error
    error = error.tone(60.0),
    onError = error.tone(10.0),
    errorContainer = error.tone(50.0),
    onErrorContainer = error.tone(90.0)
)