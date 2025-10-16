package com.compose.example.design

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

//Dark color scheme with your custom tone values
val darkColorScheme = darkColorScheme(
    // Primary
    primary = primary[80],
    onPrimary = primary[20],
    primaryContainer = primary[30],
    onPrimaryContainer = primary[90],
    inversePrimary = primary[40],
    primaryFixed = primary[90],
    primaryFixedDim = primary[80],
    onPrimaryFixed = primary[10],
    onPrimaryFixedVariant = primary[30],

    // Secondary
    secondary = secondary[80],
    onSecondary = secondary[20],
    secondaryContainer = secondary[30],
    onSecondaryContainer = secondary[90],
    secondaryFixed = secondary[90],
    secondaryFixedDim = secondary[80],
    onSecondaryFixed = secondary[10],
    onSecondaryFixedVariant = secondary[30],

    // Tertiary
    tertiary = tertiary[80],
    onTertiary = tertiary[20],
    tertiaryContainer = tertiary[30],
    onTertiaryContainer = tertiary[90],
    tertiaryFixed = tertiary[90],
    tertiaryFixedDim = tertiary[80],
    onTertiaryFixed = tertiary[10],
    onTertiaryFixedVariant = tertiary[30],

    // Neutral
    background = neutral[6],
    onBackground = neutral[90],
    surface = neutral[6],
    onSurface = neutral[90],
    surfaceTint = primary[80],
    inverseSurface = neutral[90],
    inverseOnSurface = neutral[20],
    scrim = neutral[0],
    surfaceBright = neutral[24],
    surfaceContainer = neutral[12],
    surfaceContainerHigh = neutral[17],
    surfaceContainerHighest = neutral[22],
    surfaceContainerLow = neutral[10],
    surfaceContainerLowest = neutral[4],
    surfaceDim = neutral[6],

    // NeutralVariant
    surfaceVariant = neutralVariant[30],
    onSurfaceVariant = neutralVariant[80],
    outline = neutralVariant[60],
    outlineVariant = neutralVariant[30],

    // Error
    error = error[80],
    onError = error[20],
    errorContainer = error[30],
    onErrorContainer = error[90]
)

//Light color scheme with your custom tone values
val lightColorScheme = lightColorScheme(
    // Primary
    primary = primary[40],
    onPrimary = primary[100],
    primaryContainer = primary[90],
    onPrimaryContainer = primary[10],
    inversePrimary = primary[80],
    primaryFixed = primary[90],
    primaryFixedDim = primary[80],
    onPrimaryFixed = primary[10],
    onPrimaryFixedVariant = primary[30],

    // Secondary
    secondary = secondary[40],
    onSecondary = secondary[100],
    secondaryContainer = secondary[90],
    onSecondaryContainer = secondary[10],
    secondaryFixed = secondary[90],
    secondaryFixedDim = secondary[80],
    onSecondaryFixed = secondary[10],
    onSecondaryFixedVariant = secondary[30],

    // Tertiary
    tertiary = tertiary[40],
    onTertiary = tertiary[100],
    tertiaryContainer = tertiary[90],
    onTertiaryContainer = tertiary[10],
    tertiaryFixed = tertiary[90],
    tertiaryFixedDim = tertiary[80],
    onTertiaryFixed = tertiary[10],
    onTertiaryFixedVariant = tertiary[30],

    // Neutral
    background = neutral[98],
    onBackground = neutral[10],
    surface = neutral[98],
    onSurface = neutral[10],
    surfaceTint = primary[40],
    inverseSurface = neutral[20],
    inverseOnSurface = neutral[95],
    scrim = neutral[0],
    surfaceBright = neutral[98],
    surfaceContainer = neutral[94],
    surfaceContainerHigh = neutral[92],
    surfaceContainerHighest = neutral[90],
    surfaceContainerLow = neutral[96],
    surfaceContainerLowest = neutral[100],
    surfaceDim = neutral[87],

    // NeutralVariant
    surfaceVariant = neutralVariant[90],
    onSurfaceVariant = neutralVariant[30],
    outline = neutralVariant[50],
    outlineVariant = neutralVariant[80],

    // Error
    error = error[40],
    onError = error[100],
    errorContainer = error[90],
    onErrorContainer = error[10]
)