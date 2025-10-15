package com.compose.example.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.ColorDisplay
import com.compose.example.Preview
import com.compose.example.cs

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ColorsErrorPreview() = Preview { ColorsError() }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColorsError() {
    Column(Modifier.fillMaxHeight()) {
        Row(Modifier.weight(1f)) {
            ColorDisplay(
                cs.error,
                cs.onError,
                label = "Error"
            )
        }

        Row(Modifier.weight(1f)) {
            ColorDisplay(
                cs.errorContainer,
                cs.onErrorContainer,
                label = "Error Container"
            )
        }
    }
}