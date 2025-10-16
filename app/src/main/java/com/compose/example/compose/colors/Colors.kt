package com.compose.example.compose.colors

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.example.ColorDisplay
import com.compose.example.ColorSquare
import com.compose.example.PreviewSample
import com.compose.example.cs

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsPreview() = PreviewSample { Colors() }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Colors() {
    Column(Modifier.fillMaxHeight()) {
        Row(Modifier.weight(1f)) {
            ColorDisplay(
                cs.primary,
                cs.onPrimary,
                label = "Primary"
            )
            ColorDisplay(
                cs.secondary,
                cs.onSecondary,
                label = "Secondary"
            )
            ColorDisplay(
                cs.tertiary,
                cs.onTertiary,
                label = "Tertiary"
            )
            ColorDisplay(
                cs.error,
                cs.onError,
                label = "Error"
            )
        }

        Row(Modifier.weight(1f)) {
            ColorDisplay(
                cs.primaryContainer,
                cs.onPrimaryContainer,
                label = "Primary Container"
            )
            ColorDisplay(
                cs.secondaryContainer,
                cs.onSecondaryContainer,
                label = "Secondary Container"
            )
            ColorDisplay(
                cs.tertiaryContainer,
                cs.onTertiaryContainer,
                label = "Tertiary Container"
            )
            ColorDisplay(
                cs.errorContainer,
                cs.onErrorContainer,
                label = "Error Container"
            )
        }

        Row(Modifier.weight(1f)) {
            ColorDisplay(
                cs.primaryFixed,
                cs.onPrimaryFixed,
                cs.primaryFixedDim,
                cs.onPrimaryFixedVariant,
                "Primary Fixed"
            )
            ColorDisplay(
                cs.secondaryFixed,
                cs.onSecondaryFixed,
                cs.secondaryFixedDim,
                cs.onSecondaryFixedVariant,
                "Secondary Fixed"
            )
            ColorDisplay(
                cs.tertiaryFixed,
                cs.onTertiaryFixed,
                cs.tertiaryFixedDim,
                cs.onTertiaryFixedVariant,
                "Tertiary Fixed"
            )
        }

        Row(Modifier.weight(1f)) {
            ColorDisplay(
                cs.surface,
                cs.inverseSurface,
                label = "Inverse Surface"
            )
            ColorDisplay(
                cs.primary,
                cs.inversePrimary,
                label = "Inverse Primary"
            )
            ColorDisplay(
                cs.onSurface,
                cs.inverseOnSurface,
                label = "Inverse On Surface"
            )
        }

        Row(Modifier.weight(0.5f)) {
            ColorSquare(cs.onSurface, "On Surface")
            ColorSquare(cs.onSurfaceVariant, "On Surface Variant")
            ColorSquare(cs.outline, "Outline")
            ColorSquare(cs.outlineVariant, "Outline Variant")
        }

        Text(
            "Surface Container (Lowest | Low | Standard | Highest)",
            Modifier
                .padding(start = 5.dp)
                .offset(y = 14.dp),
            fontSize = 8.sp,
            lineHeight = 8.sp,
            color = cs.onBackground
        )

        Row(Modifier.weight(0.5f)) {
            ColorSquare(cs.surfaceContainerLowest, " ")
            ColorSquare(cs.surfaceContainerLow, " ")
            ColorSquare(cs.surfaceContainer, " ")
            ColorSquare(cs.surfaceContainerHigh, " ")
            ColorSquare(cs.surfaceContainerHighest, " ")
        }

        Row(Modifier.weight(0.5f)) {
            ColorSquare(cs.surfaceDim, "Surface Dim")
            ColorSquare(cs.surface, "Surface")
            ColorSquare(cs.surfaceBright, "Surface Bright")
        }

        Row(Modifier.weight(0.5f)) {
            ColorSquare(cs.onBackground, "On Background")
        }
    }
}