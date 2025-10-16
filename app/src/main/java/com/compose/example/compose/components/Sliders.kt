package com.compose.example.compose.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.PreviewSample

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample { Sliders() }

@Composable
fun Sliders() {
    val source = remember { MutableInteractionSource() }

    Column(Modifier.height(400.dp), verticalArrangement = Arrangement.SpaceAround) {
        Slider(value = 0.2f, onValueChange = {})
        Slider(value = 0.6f, onValueChange = {}, interactionSource = source)
        Slider(value = 0.3f, onValueChange = {}, enabled = false)
        RangeSlider(
            value = 10f..30f,
            onValueChange = { },
            valueRange = 0f..40f
        )
        RangeSlider(
            value = 10f..30f,
            onValueChange = { },
            valueRange = 0f..40f,
            enabled = false
        )
    }
}