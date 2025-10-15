package com.compose.example.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.Preview

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun SwitchPreview() = Preview { Switches() }

@Composable
fun Switches() {
    Column {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Switch(checked = true, enabled = true, onCheckedChange = {})
            Switch(checked = false, enabled = true, onCheckedChange = {})
            Switch(checked = true, enabled = true, onCheckedChange = {}, thumbContent = {
                Icon(Icons.Filled.Close, "", Modifier.size(19.dp))
            })
            Switch(checked = false, enabled = true, onCheckedChange = {}, thumbContent = {
                Icon(Icons.Filled.Close, "", Modifier.size(19.dp))
            })
        }

        Spacer(Modifier.height(20.dp))

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Switch(checked = true, enabled = false, onCheckedChange = {})
            Switch(checked = false, enabled = false, onCheckedChange = {})
            Switch(checked = true, enabled = false, onCheckedChange = {}, thumbContent = {
                Icon(Icons.Filled.Close, "", Modifier.size(19.dp))
            })
            Switch(checked = false, enabled = false, onCheckedChange = {}, thumbContent = {
                Icon(Icons.Filled.Close, "", Modifier.size(19.dp))
            })
        }
    }
}