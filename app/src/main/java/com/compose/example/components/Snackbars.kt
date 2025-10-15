package com.compose.example.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.Preview

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun SnackbarsPreview() = Preview { Snackbars() }

@Composable
fun Snackbars() {
    Column(Modifier.height(400.dp), verticalArrangement = Arrangement.SpaceAround) {
        Snackbar {
            Text("Single-line snackbar")
        }

        Snackbar(
            action = { Text("Action") },
            dismissAction = {
                Icon(
                    Icons.Filled.Close,
                    "",
                    Modifier.padding(horizontal = 10.dp)
                )
            }) {
            Text("Single-line snackbar")
        }

        Snackbar(action = { Text("Action") }) {
            Text("Single-line snackbar")
        }

        Snackbar(action = { Text("Action") }) {
            Text("Single-line snackbar")
        }

        Snackbar(
            action = { Text("Longer Action", modifier = Modifier.padding(10.dp)) },
            actionOnNewLine = true
        ) {
            Text("Two-line snackbar with\nlonger action")
        }
    }
}