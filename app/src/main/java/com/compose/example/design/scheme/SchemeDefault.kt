package com.compose.example.design.scheme

import androidx.compose.material3.ColorScheme
import com.compose.example.design.error
import com.compose.example.design.neutral
import com.compose.example.design.neutralVariant
import com.compose.example.design.primary
import com.compose.example.design.secondary
import com.compose.example.design.tertiary
import com.compose.example.tone

//Light color scheme with default to Material 3 tone values
//Use it as a blank canvas to be copied to Scheme.kt
val lightDefaultColorScheme = ColorScheme(
    // Primary
    primary = primary.tone(40.0),
    onPrimary = primary.tone(100.0),
    primaryContainer = primary.tone(90.0),
    onPrimaryContainer = primary.tone(10.0),
    inversePrimary = primary.tone(80.0),
    primaryFixed = primary.tone(90.0),
    primaryFixedDim = primary.tone(80.0),
    onPrimaryFixed = primary.tone(10.0),
    onPrimaryFixedVariant = primary.tone(30.0),

    // Secondary
    secondary = secondary.tone(40.0),
    onSecondary = secondary.tone(100.0),
    secondaryContainer = secondary.tone(90.0),
    onSecondaryContainer = secondary.tone(10.0),
    secondaryFixed = secondary.tone(90.0),
    secondaryFixedDim = secondary.tone(80.0),
    onSecondaryFixed = secondary.tone(10.0),
    onSecondaryFixedVariant = secondary.tone(30.0),

    // Tertiary
    tertiary = tertiary.tone(40.0),
    onTertiary = tertiary.tone(100.0),
    tertiaryContainer = tertiary.tone(90.0),
    onTertiaryContainer = tertiary.tone(10.0),
    tertiaryFixed = tertiary.tone(90.0),
    tertiaryFixedDim = tertiary.tone(80.0),
    onTertiaryFixed = tertiary.tone(10.0),
    onTertiaryFixedVariant = tertiary.tone(30.0),

    // Neutral
    background = neutral.tone(98.0),
    onBackground = neutral.tone(10.0),
    surface = neutral.tone(98.0),
    onSurface = neutral.tone(10.0),
    surfaceTint = primary.tone(40.0),
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
    error = error.tone(40.0),
    onError = error.tone(100.0),
    errorContainer = error.tone(90.0),
    onErrorContainer = error.tone(10.0)
)

//Dark color scheme with default to Material 3 tone values
//Use it as a blank canvas to be copied to Scheme.kt
val darkDefaultColorScheme = ColorScheme(
    // Primary
    primary = primary.tone(80.0),
    onPrimary = primary.tone(20.0),
    primaryContainer = primary.tone(30.0),
    onPrimaryContainer = primary.tone(90.0),
    inversePrimary = primary.tone(40.0),
    primaryFixed = primary.tone(90.0),
    primaryFixedDim = primary.tone(80.0),
    onPrimaryFixed = primary.tone(10.0),
    onPrimaryFixedVariant = primary.tone(30.0),

    // Secondary
    secondary = secondary.tone(80.0),
    onSecondary = secondary.tone(20.0),
    secondaryContainer = secondary.tone(30.0),
    onSecondaryContainer = secondary.tone(90.0),
    secondaryFixed = secondary.tone(90.0),
    secondaryFixedDim = secondary.tone(80.0),
    onSecondaryFixed = secondary.tone(10.0),
    onSecondaryFixedVariant = secondary.tone(30.0),

    // Tertiary
    tertiary = tertiary.tone(80.0),
    onTertiary = tertiary.tone(20.0),
    tertiaryContainer = tertiary.tone(30.0),
    onTertiaryContainer = tertiary.tone(90.0),
    tertiaryFixed = tertiary.tone(90.0),
    tertiaryFixedDim = tertiary.tone(80.0),
    onTertiaryFixed = tertiary.tone(10.0),
    onTertiaryFixedVariant = tertiary.tone(30.0),

    // Neutral
    background = neutral.tone(6.0),
    onBackground = neutral.tone(90.0),
    surface = neutral.tone(6.0),
    onSurface = neutral.tone(90.0),
    surfaceTint = primary.tone(80.0),
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
    surfaceVariant = neutralVariant.tone(30.0),
    onSurfaceVariant = neutralVariant.tone(80.0),
    outline = neutralVariant.tone(60.0),
    outlineVariant = neutralVariant.tone(30.0),

    // Error
    error = error.tone(80.0),
    onError = error.tone(20.0),
    errorContainer = error.tone(30.0),
    onErrorContainer = error.tone(90.0)
)