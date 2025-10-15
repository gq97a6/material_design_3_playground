package com.compose.example.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.Preview

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ProgressIndicatorsPreview() = Preview { ProgressIndicators() }

@Composable
fun ProgressIndicators() {
    Column {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            CircularProgressIndicator(progress = { 0.2f })
            CircularProgressIndicator(progress = { 0.6f })
            CircularProgressIndicator(progress = { 0.8f })
            CircularProgressIndicator(progress = { 0.4f })
        }
        Spacer(Modifier.height(40.dp))
        LinearProgressIndicator(progress = { 0.2f })
        Spacer(Modifier.height(30.dp))
        LinearProgressIndicator(progress = { 0.5f })
        Spacer(Modifier.height(30.dp))
        LinearProgressIndicator(progress = { 0.4f })
        Spacer(Modifier.height(30.dp))
        LinearProgressIndicator(progress = { 0.8f })
    }
}