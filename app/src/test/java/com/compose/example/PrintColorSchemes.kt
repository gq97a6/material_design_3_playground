package com.compose.example

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color
import com.compose.example.design.darkColorScheme
import com.compose.example.design.lightColorScheme
import org.junit.Test

import org.junit.Assert.*
import java.io.File

//Outputs file to app/Schemes.kt
class PrintColorSchemes {
    @Test
    fun print() {
        val file = File("Schemes.kt")
        file.writeText("")

        getColorSchemeOutput(
            variableName = "darkColorScheme",
            functionName = "darkColorScheme",
            cs = darkColorScheme
        ).let { file.appendText(it) }

        file.appendText("\n")

        getColorSchemeOutput(
            variableName = "lightColorScheme",
            functionName = "lightColorScheme",
            cs = lightColorScheme
        ).let { file.appendText(it) }
    }
}

fun Color.print(): String = "Color(${(this.red * 100).toInt()}, ${(this.green * 100).toInt()}, ${(this.blue * 100).toInt()})"

fun getColorSchemeOutput(
    variableName: String,
    functionName: String,
    cs: ColorScheme
) = buildString {
    appendLine("val $variableName = $functionName(")
    appendLine("    primary = ${cs.primary.print()},")
    appendLine("    onPrimary = ${cs.onPrimary.print()},")
    appendLine("    primaryContainer = ${cs.primaryContainer.print()},")
    appendLine("    onPrimaryContainer = ${cs.onPrimaryContainer.print()},")
    appendLine("    inversePrimary = ${cs.inversePrimary.print()},")
    appendLine("    secondary = ${cs.secondary.print()},")
    appendLine("    onSecondary = ${cs.onSecondary.print()},")
    appendLine("    secondaryContainer = ${cs.secondaryContainer.print()},")
    appendLine("    onSecondaryContainer = ${cs.onSecondaryContainer.print()},")
    appendLine("    tertiary = ${cs.tertiary.print()},")
    appendLine("    onTertiary = ${cs.onTertiary.print()},")
    appendLine("    tertiaryContainer = ${cs.tertiaryContainer.print()},")
    appendLine("    onTertiaryContainer = ${cs.onTertiaryContainer.print()},")
    appendLine("    background = ${cs.background.print()},")
    appendLine("    onBackground = ${cs.onBackground.print()},")
    appendLine("    surface = ${cs.surface.print()},")
    appendLine("    onSurface = ${cs.onSurface.print()},")
    appendLine("    surfaceVariant = ${cs.surfaceVariant.print()},")
    appendLine("    onSurfaceVariant = ${cs.onSurfaceVariant.print()},")
    appendLine("    surfaceTint = ${cs.surfaceTint.print()},")
    appendLine("    inverseSurface = ${cs.inverseSurface.print()},")
    appendLine("    inverseOnSurface = ${cs.inverseOnSurface.print()},")
    appendLine("    error = ${cs.error.print()},")
    appendLine("    onError = ${cs.onError.print()},")
    appendLine("    errorContainer = ${cs.errorContainer.print()},")
    appendLine("    onErrorContainer = ${cs.onErrorContainer.print()},")
    appendLine("    outline = ${cs.outline.print()},")
    appendLine("    outlineVariant = ${cs.outlineVariant.print()},")
    appendLine("    scrim = ${cs.scrim.print()},")
    appendLine("    surfaceBright = ${cs.surfaceBright.print()},")
    appendLine("    surfaceContainer = ${cs.surfaceContainer.print()},")
    appendLine("    surfaceContainerHigh = ${cs.surfaceContainerHigh.print()},")
    appendLine("    surfaceContainerHighest = ${cs.surfaceContainerHighest.print()},")
    appendLine("    surfaceContainerLow = ${cs.surfaceContainerLow.print()},")
    appendLine("    surfaceContainerLowest = ${cs.surfaceContainerLowest.print()},")
    appendLine("    surfaceDim = ${cs.surfaceDim.print()},")
    appendLine("    primaryFixed = ${cs.primaryFixed.print()},")
    appendLine("    primaryFixedDim = ${cs.primaryFixedDim.print()},")
    appendLine("    onPrimaryFixed = ${cs.onPrimaryFixed.print()},")
    appendLine("    onPrimaryFixedVariant = ${cs.onPrimaryFixedVariant.print()},")
    appendLine("    secondaryFixed = ${cs.secondaryFixed.print()},")
    appendLine("    secondaryFixedDim = ${cs.secondaryFixedDim.print()},")
    appendLine("    onSecondaryFixed = ${cs.onSecondaryFixed.print()},")
    appendLine("    onSecondaryFixedVariant = ${cs.onSecondaryFixedVariant.print()},")
    appendLine("    tertiaryFixed = ${cs.tertiaryFixed.print()},")
    appendLine("    tertiaryFixedDim = ${cs.tertiaryFixedDim.print()},")
    appendLine("    onTertiaryFixed = ${cs.onTertiaryFixed.print()},")
    appendLine("    onTertiaryFixedVariant = ${cs.onTertiaryFixedVariant.print()}")
    appendLine(")")
}