package com.compose.example.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.Preview

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun CardsPreview() = Preview { Cards() }

@Composable
fun Cards() {
    Column(Modifier.padding(10.dp)) {
        val mod = Modifier
            .weight(1f)
            .fillMaxWidth()
            .padding(10.dp)

        OutlinedCard(mod) { }
        ElevatedCard(mod) { }
        Card(mod) { }
    }
}