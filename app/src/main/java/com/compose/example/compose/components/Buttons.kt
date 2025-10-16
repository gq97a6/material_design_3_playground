package com.compose.example.compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.ButtonWithIconContentPadding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.PreviewSample

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample { Buttons() }

@Composable
fun Buttons() {
    Column {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Button({}, enabled = true) { Text("Label") }
            Button({}, enabled = false) { Text("Label") }
        }

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Button({}, enabled = true, contentPadding = ButtonWithIconContentPadding) {
                Icon(Icons.Filled.Add, "", Modifier.size(19.dp))
                Spacer(Modifier.size(6.dp))
                Text("Label")
            }
            Button({}, enabled = false, contentPadding = ButtonWithIconContentPadding) {
                Icon(Icons.Filled.Add, "", Modifier.size(19.dp))
                Spacer(Modifier.size(6.dp))
                Text("Label")
            }
        }

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            OutlinedButton({}, enabled = true) {
                Text("Label")
            }
            OutlinedButton({}, enabled = false) {
                Text("Label")
            }
        }

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            OutlinedButton({}, enabled = true, contentPadding = ButtonWithIconContentPadding) {
                Icon(Icons.Filled.Add, "", Modifier.size(19.dp))
                Spacer(Modifier.size(6.dp))
                Text("Label")
            }
            OutlinedButton({}, enabled = false, contentPadding = ButtonWithIconContentPadding) {
                Icon(Icons.Filled.Add, "", Modifier.size(19.dp))
                Spacer(Modifier.size(6.dp))
                Text("Label")
            }
        }

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            TextButton({}, enabled = true) {
                Text("Label")
            }
            TextButton({}, enabled = false) {
                Text("Label")
            }
        }

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            TextButton({}, enabled = true, contentPadding = ButtonWithIconContentPadding) {
                Icon(Icons.Filled.Add, "", Modifier.size(19.dp))
                Spacer(Modifier.size(6.dp))
                Text("Label")
            }
            TextButton({}, enabled = false, contentPadding = ButtonWithIconContentPadding) {
                Icon(Icons.Filled.Add, "", Modifier.size(19.dp))
                Spacer(Modifier.size(6.dp))
                Text("Label")
            }
        }

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            ElevatedButton({}, enabled = true) {
                Text("Label")
            }
            ElevatedButton({}, enabled = false) {
                Text("Label")
            }
        }

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            ElevatedButton({}, enabled = true, contentPadding = ButtonWithIconContentPadding) {
                Icon(Icons.Filled.Add, "", Modifier.size(19.dp))
                Spacer(Modifier.size(6.dp))
                Text("Label")
            }
            ElevatedButton({}, enabled = false, contentPadding = ButtonWithIconContentPadding) {
                Icon(Icons.Filled.Add, "", Modifier.size(19.dp))
                Spacer(Modifier.size(6.dp))
                Text("Label")
            }
        }

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            FilledTonalButton({}, enabled = true) {
                Text("Label")
            }
            FilledTonalButton({}, enabled = false) {
                Text("Label")
            }
        }

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            FilledTonalButton({}, enabled = true, contentPadding = ButtonWithIconContentPadding) {
                Icon(Icons.Filled.Add, "", Modifier.size(19.dp))
                Spacer(Modifier.size(6.dp))
                Text("Label")
            }
            FilledTonalButton({}, enabled = false, contentPadding = ButtonWithIconContentPadding) {
                Icon(Icons.Filled.Add, "", Modifier.size(19.dp))
                Spacer(Modifier.size(6.dp))
                Text("Label")
            }
        }
    }
}