package com.compose.example.compose.colors

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.ColorDisplay
import com.compose.example.PreviewSample
import com.compose.example.cs

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsPrimaryPreview() = PreviewSample { ColorsPrimary() }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColorsPrimary() {
    Column(Modifier.fillMaxHeight()) {
        Row(Modifier.weight(1f)) {
            ColorDisplay(
                cs.primary,
                cs.onPrimary,
                label = "Primary"
            )
        }

        Row(Modifier.weight(1f)) {
            ColorDisplay(
                cs.primaryContainer,
                cs.onPrimaryContainer,
                label = "Primary Container"
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
        }

        Row(Modifier.weight(1f)) {
            ColorDisplay(
                cs.primary,
                cs.inversePrimary,
                label = "Inverse Primary"
            )
        }
    }
}