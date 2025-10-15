package com.compose.example.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults.iconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.Preview

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun IconButtonsPreview() = Preview { IconButtons() }

@Composable
fun IconButtons() {
    Row {
        Column {
            IconButton(
                {},
                enabled = true,
                colors = iconButtonColors(contentColor = MaterialTheme.colorScheme.onSurfaceVariant)
            ) {
                Icon(Icons.Outlined.Settings, "")
            }

            FilledIconButton({}, enabled = true) {
                Icon(Icons.Outlined.Settings, "")
            }

            FilledTonalIconButton({}, enabled = true) {
                Icon(Icons.Outlined.Settings, "")
            }
        }

        Column {
            IconButton(
                {},
                enabled = false,
                colors = iconButtonColors(contentColor = MaterialTheme.colorScheme.onSurfaceVariant)
            ) {
                Icon(Icons.Outlined.Settings, "")
            }

            FilledIconButton({}, enabled = false) {
                Icon(Icons.Outlined.Settings, "")
            }

            FilledTonalIconButton({}, enabled = false) {
                Icon(Icons.Outlined.Settings, "")
            }
        }
    }
}