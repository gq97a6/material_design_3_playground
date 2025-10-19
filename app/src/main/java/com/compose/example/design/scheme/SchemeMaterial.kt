package com.compose.example.design.scheme

import androidx.compose.material3.ColorScheme
import com.compose.example.design.errorMaterial
import com.compose.example.design.neutralMaterial
import com.compose.example.design.neutralVariantMaterial
import com.compose.example.design.primaryMaterial
import com.compose.example.design.secondaryMaterial
import com.compose.example.design.tertiaryMaterial
import com.compose.example.tone

//Light color scheme with Material palette
val lightMaterialColorScheme = ColorScheme(
    // Primary
    primary = primaryMaterial.tone(40.0),
    onPrimary = primaryMaterial.tone(100.0),
    primaryContainer = primaryMaterial.tone(90.0),
    onPrimaryContainer = primaryMaterial.tone(10.0),
    inversePrimary = primaryMaterial.tone(80.0),
    primaryFixed = primaryMaterial.tone(90.0),
    primaryFixedDim = primaryMaterial.tone(80.0),
    onPrimaryFixed = primaryMaterial.tone(10.0),
    onPrimaryFixedVariant = primaryMaterial.tone(30.0),

    // Secondary
    secondary = secondaryMaterial.tone(40.0),
    onSecondary = secondaryMaterial.tone(100.0),
    secondaryContainer = secondaryMaterial.tone(90.0),
    onSecondaryContainer = secondaryMaterial.tone(10.0),
    secondaryFixed = secondaryMaterial.tone(90.0),
    secondaryFixedDim = secondaryMaterial.tone(80.0),
    onSecondaryFixed = secondaryMaterial.tone(10.0),
    onSecondaryFixedVariant = secondaryMaterial.tone(30.0),

    // Tertiary
    tertiary = tertiaryMaterial.tone(40.0),
    onTertiary = tertiaryMaterial.tone(100.0),
    tertiaryContainer = tertiaryMaterial.tone(90.0),
    onTertiaryContainer = tertiaryMaterial.tone(10.0),
    tertiaryFixed = tertiaryMaterial.tone(90.0),
    tertiaryFixedDim = tertiaryMaterial.tone(80.0),
    onTertiaryFixed = tertiaryMaterial.tone(10.0),
    onTertiaryFixedVariant = tertiaryMaterial.tone(30.0),

    // Neutral
    background = neutralMaterial.tone(98.0),
    onBackground = neutralMaterial.tone(10.0),
    surface = neutralMaterial.tone(98.0),
    onSurface = neutralMaterial.tone(10.0),
    surfaceTint = primaryMaterial.tone(40.0),
    inverseSurface = neutralMaterial.tone(20.0),
    inverseOnSurface = neutralMaterial.tone(95.0),
    scrim = neutralMaterial.tone(0.0),
    surfaceBright = neutralMaterial.tone(98.0),
    surfaceContainer = neutralMaterial.tone(94.0),
    surfaceContainerHigh = neutralMaterial.tone(92.0),
    surfaceContainerHighest = neutralMaterial.tone(90.0),
    surfaceContainerLow = neutralMaterial.tone(96.0),
    surfaceContainerLowest = neutralMaterial.tone(100.0),
    surfaceDim = neutralMaterial.tone(87.0),

    // NeutralVariant
    surfaceVariant = neutralVariantMaterial.tone(90.0),
    onSurfaceVariant = neutralVariantMaterial.tone(30.0),
    outline = neutralVariantMaterial.tone(50.0),
    outlineVariant = neutralVariantMaterial.tone(80.0),

    // Error
    error = errorMaterial.tone(40.0),
    onError = errorMaterial.tone(100.0),
    errorContainer = errorMaterial.tone(90.0),
    onErrorContainer = errorMaterial.tone(10.0)
)

//Dark color scheme with Material palette
val darkMaterialColorScheme = ColorScheme(
    // Primary
    primary = primaryMaterial.tone(80.0),
    onPrimary = primaryMaterial.tone(20.0),
    primaryContainer = primaryMaterial.tone(30.0),
    onPrimaryContainer = primaryMaterial.tone(90.0),
    inversePrimary = primaryMaterial.tone(40.0),
    primaryFixed = primaryMaterial.tone(90.0),
    primaryFixedDim = primaryMaterial.tone(80.0),
    onPrimaryFixed = primaryMaterial.tone(10.0),
    onPrimaryFixedVariant = primaryMaterial.tone(30.0),

    // Secondary
    secondary = secondaryMaterial.tone(80.0),
    onSecondary = secondaryMaterial.tone(20.0),
    secondaryContainer = secondaryMaterial.tone(30.0),
    onSecondaryContainer = secondaryMaterial.tone(90.0),
    secondaryFixed = secondaryMaterial.tone(90.0),
    secondaryFixedDim = secondaryMaterial.tone(80.0),
    onSecondaryFixed = secondaryMaterial.tone(10.0),
    onSecondaryFixedVariant = secondaryMaterial.tone(30.0),

    // Tertiary
    tertiary = tertiaryMaterial.tone(80.0),
    onTertiary = tertiaryMaterial.tone(20.0),
    tertiaryContainer = tertiaryMaterial.tone(30.0),
    onTertiaryContainer = tertiaryMaterial.tone(90.0),
    tertiaryFixed = tertiaryMaterial.tone(90.0),
    tertiaryFixedDim = tertiaryMaterial.tone(80.0),
    onTertiaryFixed = tertiaryMaterial.tone(10.0),
    onTertiaryFixedVariant = tertiaryMaterial.tone(30.0),

    // Neutral
    background = neutralMaterial.tone(6.0),
    onBackground = neutralMaterial.tone(90.0),
    surface = neutralMaterial.tone(6.0),
    onSurface = neutralMaterial.tone(90.0),
    surfaceTint = primaryMaterial.tone(80.0),
    inverseSurface = neutralMaterial.tone(90.0),
    inverseOnSurface = neutralMaterial.tone(20.0),
    scrim = neutralMaterial.tone(0.0),
    surfaceBright = neutralMaterial.tone(24.0),
    surfaceContainer = neutralMaterial.tone(12.0),
    surfaceContainerHigh = neutralMaterial.tone(17.0),
    surfaceContainerHighest = neutralMaterial.tone(22.0),
    surfaceContainerLow = neutralMaterial.tone(10.0),
    surfaceContainerLowest = neutralMaterial.tone(4.0),
    surfaceDim = neutralMaterial.tone(6.0),

    // NeutralVariant
    surfaceVariant = neutralVariantMaterial.tone(30.0),
    onSurfaceVariant = neutralVariantMaterial.tone(80.0),
    outline = neutralVariantMaterial.tone(60.0),
    outlineVariant = neutralVariantMaterial.tone(30.0),

    // Error
    error = errorMaterial.tone(80.0),
    onError = errorMaterial.tone(20.0),
    errorContainer = errorMaterial.tone(30.0),
    onErrorContainer = errorMaterial.tone(90.0)
)