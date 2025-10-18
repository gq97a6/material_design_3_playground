package com.compose.example.design

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

//Light color scheme with Material palette
val lightMaterialColorScheme = lightColorScheme(
    // Primary
    primary = primaryMaterial[40],
    onPrimary = primaryMaterial[100],
    primaryContainer = primaryMaterial[90],
    onPrimaryContainer = primaryMaterial[10],
    inversePrimary = primaryMaterial[80],
    primaryFixed = primaryMaterial[90],
    primaryFixedDim = primaryMaterial[80],
    onPrimaryFixed = primaryMaterial[10],
    onPrimaryFixedVariant = primaryMaterial[30],

    // Secondary
    secondary = secondaryMaterial[40],
    onSecondary = secondaryMaterial[100],
    secondaryContainer = secondaryMaterial[90],
    onSecondaryContainer = secondaryMaterial[10],
    secondaryFixed = secondaryMaterial[90],
    secondaryFixedDim = secondaryMaterial[80],
    onSecondaryFixed = secondaryMaterial[10],
    onSecondaryFixedVariant = secondaryMaterial[30],

    // Tertiary
    tertiary = tertiaryMaterial[40],
    onTertiary = tertiaryMaterial[100],
    tertiaryContainer = tertiaryMaterial[90],
    onTertiaryContainer = tertiaryMaterial[10],
    tertiaryFixed = tertiaryMaterial[90],
    tertiaryFixedDim = tertiaryMaterial[80],
    onTertiaryFixed = tertiaryMaterial[10],
    onTertiaryFixedVariant = tertiaryMaterial[30],

    // Neutral
    background = neutralMaterial[98],
    onBackground = neutralMaterial[10],
    surface = neutralMaterial[98],
    onSurface = neutralMaterial[10],
    surfaceTint = primaryMaterial[40],
    inverseSurface = neutralMaterial[20],
    inverseOnSurface = neutralMaterial[95],
    scrim = neutralMaterial[0],
    surfaceBright = neutralMaterial[98],
    surfaceContainer = neutralMaterial[94],
    surfaceContainerHigh = neutralMaterial[92],
    surfaceContainerHighest = neutralMaterial[90],
    surfaceContainerLow = neutralMaterial[96],
    surfaceContainerLowest = neutralMaterial[100],
    surfaceDim = neutralMaterial[87],

    // NeutralVariant
    surfaceVariant = neutralVariantMaterial[90],
    onSurfaceVariant = neutralVariantMaterial[30],
    outline = neutralVariantMaterial[50],
    outlineVariant = neutralVariantMaterial[80],

    // Error
    error = errorMaterial[40],
    onError = errorMaterial[100],
    errorContainer = errorMaterial[90],
    onErrorContainer = errorMaterial[10]
)

//Dark color scheme with Material palette
val darkMaterialColorScheme = darkColorScheme(
    // Primary
    primary = primaryMaterial[80],
    onPrimary = primaryMaterial[20],
    primaryContainer = primaryMaterial[30],
    onPrimaryContainer = primaryMaterial[90],
    inversePrimary = primaryMaterial[40],
    primaryFixed = primaryMaterial[90],
    primaryFixedDim = primaryMaterial[80],
    onPrimaryFixed = primaryMaterial[10],
    onPrimaryFixedVariant = primaryMaterial[30],

    // Secondary
    secondary = secondaryMaterial[80],
    onSecondary = secondaryMaterial[20],
    secondaryContainer = secondaryMaterial[30],
    onSecondaryContainer = secondaryMaterial[90],
    secondaryFixed = secondaryMaterial[90],
    secondaryFixedDim = secondaryMaterial[80],
    onSecondaryFixed = secondaryMaterial[10],
    onSecondaryFixedVariant = secondaryMaterial[30],

    // Tertiary
    tertiary = tertiaryMaterial[80],
    onTertiary = tertiaryMaterial[20],
    tertiaryContainer = tertiaryMaterial[30],
    onTertiaryContainer = tertiaryMaterial[90],
    tertiaryFixed = tertiaryMaterial[90],
    tertiaryFixedDim = tertiaryMaterial[80],
    onTertiaryFixed = tertiaryMaterial[10],
    onTertiaryFixedVariant = tertiaryMaterial[30],

    // Neutral
    background = neutralMaterial[6],
    onBackground = neutralMaterial[90],
    surface = neutralMaterial[6],
    onSurface = neutralMaterial[90],
    surfaceTint = primaryMaterial[80],
    inverseSurface = neutralMaterial[90],
    inverseOnSurface = neutralMaterial[20],
    scrim = neutralMaterial[0],
    surfaceBright = neutralMaterial[24],
    surfaceContainer = neutralMaterial[12],
    surfaceContainerHigh = neutralMaterial[17],
    surfaceContainerHighest = neutralMaterial[22],
    surfaceContainerLow = neutralMaterial[10],
    surfaceContainerLowest = neutralMaterial[4],
    surfaceDim = neutralMaterial[6],

    // NeutralVariant
    surfaceVariant = neutralVariantMaterial[30],
    onSurfaceVariant = neutralVariantMaterial[80],
    outline = neutralVariantMaterial[60],
    outlineVariant = neutralVariantMaterial[30],

    // Error
    error = errorMaterial[80],
    onError = errorMaterial[20],
    errorContainer = errorMaterial[30],
    onErrorContainer = errorMaterial[90]
)