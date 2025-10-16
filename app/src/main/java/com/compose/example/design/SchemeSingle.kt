package com.compose.example.design

import com.compose.example.modified

//Grayscale dark color scheme with primary color
val darkPrimaryColorScheme = darkWhiteColorScheme.modified(
    primary = darkColorScheme.primary,
    onPrimary = darkColorScheme.onPrimary,
    primaryContainer = darkColorScheme.primaryContainer,
    onPrimaryContainer = darkColorScheme.onPrimaryContainer,
    inversePrimary = darkColorScheme.inversePrimary,
    primaryFixed = darkColorScheme.primaryFixed,
    primaryFixedDim = darkColorScheme.primaryFixedDim,
    onPrimaryFixed = darkColorScheme.onPrimaryFixed,
    onPrimaryFixedVariant = darkColorScheme.onPrimaryFixedVariant
)

//Grayscale light color scheme with primary color
val lightPrimaryColorScheme = lightWhiteColorScheme.modified(
    primary = lightColorScheme.primary,
    onPrimary = lightColorScheme.onPrimary,
    primaryContainer = lightColorScheme.primaryContainer,
    onPrimaryContainer = lightColorScheme.onPrimaryContainer,
    inversePrimary = lightColorScheme.inversePrimary,
    primaryFixed = lightColorScheme.primaryFixed,
    primaryFixedDim = lightColorScheme.primaryFixedDim,
    onPrimaryFixed = lightColorScheme.onPrimaryFixed,
    onPrimaryFixedVariant = lightColorScheme.onPrimaryFixedVariant
)

//Grayscale dark color scheme with secondary color
val darkSecondaryColorScheme = darkWhiteColorScheme.modified(
    secondary = darkColorScheme.secondary,
    onSecondary = darkColorScheme.onSecondary,
    secondaryContainer = darkColorScheme.secondaryContainer,
    onSecondaryContainer = darkColorScheme.onSecondaryContainer,
    secondaryFixed = darkColorScheme.secondaryFixed,
    secondaryFixedDim = darkColorScheme.secondaryFixedDim,
    onSecondaryFixed = darkColorScheme.onSecondaryFixed,
    onSecondaryFixedVariant = darkColorScheme.onSecondaryFixedVariant
)

//Grayscale light color scheme with secondary color
val lightSecondaryColorScheme = lightWhiteColorScheme.modified(
    secondary = lightColorScheme.secondary,
    onSecondary = lightColorScheme.onSecondary,
    secondaryContainer = lightColorScheme.secondaryContainer,
    onSecondaryContainer = lightColorScheme.onSecondaryContainer,
    secondaryFixed = lightColorScheme.secondaryFixed,
    secondaryFixedDim = lightColorScheme.secondaryFixedDim,
    onSecondaryFixed = lightColorScheme.onSecondaryFixed,
    onSecondaryFixedVariant = lightColorScheme.onSecondaryFixedVariant
)

//Grayscale dark color scheme with tertiary color
val darkTertiaryColorScheme = darkWhiteColorScheme.modified(
    tertiary = darkColorScheme.tertiary,
    onTertiary = darkColorScheme.onTertiary,
    tertiaryContainer = darkColorScheme.tertiaryContainer,
    onTertiaryContainer = darkColorScheme.onTertiaryContainer,
    tertiaryFixed = darkColorScheme.tertiaryFixed,
    tertiaryFixedDim = darkColorScheme.tertiaryFixedDim,
    onTertiaryFixed = darkColorScheme.onTertiaryFixed,
    onTertiaryFixedVariant = darkColorScheme.onTertiaryFixedVariant
)

//Grayscale light color scheme with tertiary color
val lightTertiaryColorScheme = lightWhiteColorScheme.modified(
    tertiary = lightColorScheme.tertiary,
    onTertiary = lightColorScheme.onTertiary,
    tertiaryContainer = lightColorScheme.tertiaryContainer,
    onTertiaryContainer = lightColorScheme.onTertiaryContainer,
    tertiaryFixed = lightColorScheme.tertiaryFixed,
    tertiaryFixedDim = lightColorScheme.tertiaryFixedDim,
    onTertiaryFixed = lightColorScheme.onTertiaryFixed,
    onTertiaryFixedVariant = lightColorScheme.onTertiaryFixedVariant
)

//Grayscale dark color scheme with neutral color
val darkNeutralColorScheme = darkWhiteColorScheme.modified(
    background = darkColorScheme.background,
    onBackground = darkColorScheme.onBackground,
    surface = darkColorScheme.surface,
    onSurface = darkColorScheme.onSurface,
    surfaceTint = darkColorScheme.surfaceTint,
    inverseSurface = darkColorScheme.inverseSurface,
    inverseOnSurface = darkColorScheme.inverseOnSurface,
    scrim = darkColorScheme.scrim,
    surfaceBright = darkColorScheme.surfaceBright,
    surfaceContainer = darkColorScheme.surfaceContainer,
    surfaceContainerHigh = darkColorScheme.surfaceContainerHigh,
    surfaceContainerHighest = darkColorScheme.surfaceContainerHighest,
    surfaceContainerLow = darkColorScheme.surfaceContainerLow,
    surfaceContainerLowest = darkColorScheme.surfaceContainerLowest,
    surfaceDim = darkColorScheme.surfaceDim
)

//Grayscale light color scheme with neutral color
val lightNeutralColorScheme = lightWhiteColorScheme.modified(
    background = lightColorScheme.background,
    onBackground = lightColorScheme.onBackground,
    surface = lightColorScheme.surface,
    onSurface = lightColorScheme.onSurface,
    surfaceTint = lightColorScheme.surfaceTint,
    inverseSurface = lightColorScheme.inverseSurface,
    inverseOnSurface = lightColorScheme.inverseOnSurface,
    scrim = lightColorScheme.scrim,
    surfaceBright = lightColorScheme.surfaceBright,
    surfaceContainer = lightColorScheme.surfaceContainer,
    surfaceContainerHigh = lightColorScheme.surfaceContainerHigh,
    surfaceContainerHighest = lightColorScheme.surfaceContainerHighest,
    surfaceContainerLow = lightColorScheme.surfaceContainerLow,
    surfaceContainerLowest = lightColorScheme.surfaceContainerLowest,
    surfaceDim = lightColorScheme.surfaceDim
)

//Grayscale dark color scheme with error color
val darkErrorColorScheme = darkWhiteColorScheme.modified(
    error = darkColorScheme.error,
    onError = darkColorScheme.onError,
    errorContainer = darkColorScheme.errorContainer,
    onErrorContainer = darkColorScheme.onErrorContainer
)

//Grayscale light color scheme with error color
val lightErrorColorScheme = lightWhiteColorScheme.modified(
    error = lightColorScheme.error,
    onError = lightColorScheme.onError,
    errorContainer = lightColorScheme.errorContainer,
    onErrorContainer = lightColorScheme.onErrorContainer
)