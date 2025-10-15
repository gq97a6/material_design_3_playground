package com.compose.example.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.Preview

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun BottomAppBarsPreview() = Preview { BottomAppBars() }

@Composable
fun BottomAppBars() {
    Column {
        repeat(4) {
            BottomAppBar(Modifier.padding(10.dp)) {
                repeat(it + 1) {
                    Icon(
                        Icons.Filled.Circle, "", Modifier
                            .padding(20.dp)
                            .height(15.dp)
                    )
                }
            }
        }
        repeat(4) {
            BottomAppBar(
                Modifier.padding(10.dp),
                contentPadding = PaddingValues(horizontal = 20.dp)
            ) {
                repeat(it + 1) {
                    Icon(
                        Icons.Filled.Circle, "", Modifier
                            .padding(end = 40.dp)
                            .height(15.dp)
                    )
                }

                Spacer(Modifier.weight(1.0f))

                FloatingActionButton(
                    {},
                    containerColor = MaterialTheme.colorScheme.secondary,
                    contentColor = MaterialTheme.colorScheme.onSecondary,
                    modifier = Modifier
                ) {
                    Icon(Icons.Filled.Add, "")
                }
            }
        }
    }
}