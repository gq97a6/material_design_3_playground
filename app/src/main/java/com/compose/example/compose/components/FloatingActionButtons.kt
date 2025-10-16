package com.compose.example.compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.PreviewSample

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample { FloatingActionButtons() }

@Composable
fun FloatingActionButtons() {
    Column {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            SmallFloatingActionButton(
                {},
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
            ) {
                Icon(Icons.Filled.Edit, "")
            }

            SmallFloatingActionButton(
                {},
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier
            ) {
                Icon(Icons.Filled.Edit, "")
            }

            SmallFloatingActionButton(
                {},
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.onSecondary,
                modifier = Modifier
            ) {
                Icon(Icons.Filled.Edit, "")
            }

            SmallFloatingActionButton(
                {},
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = MaterialTheme.colorScheme.onTertiary,
                modifier = Modifier
            ) {
                Icon(Icons.Filled.Edit, "")
            }
        }

        Spacer(Modifier.height(20.dp))

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            FloatingActionButton(
                {},
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
            ) {
                Icon(Icons.Filled.Edit, "")
            }

            FloatingActionButton(
                {},
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                modifier = Modifier
            ) {
                Icon(Icons.Filled.Edit, "")
            }

            FloatingActionButton(
                {},
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.onSecondary,
                modifier = Modifier
            ) {
                Icon(Icons.Filled.Edit, "")
            }

            FloatingActionButton(
                {},
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = MaterialTheme.colorScheme.onTertiary,
                modifier = Modifier
            ) {
                Icon(Icons.Filled.Edit, "")
            }
        }

        Spacer(Modifier.height(20.dp))

        LargeFloatingActionButton(
            {},
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier
        ) {
            Icon(Icons.Filled.Edit, "")
        }

        Spacer(Modifier.height(20.dp))

        LargeFloatingActionButton(
            {},
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
        ) {
            Icon(Icons.Filled.Edit, "")
        }

        Spacer(Modifier.height(20.dp))

        LargeFloatingActionButton(
            {},
            containerColor = MaterialTheme.colorScheme.secondary,
            contentColor = MaterialTheme.colorScheme.onSecondary,
            modifier = Modifier
        ) {
            Icon(Icons.Filled.Edit, "")
        }

        Spacer(Modifier.height(20.dp))

        LargeFloatingActionButton(
            {},
            containerColor = MaterialTheme.colorScheme.tertiary,
            contentColor = MaterialTheme.colorScheme.onTertiary,
            modifier = Modifier
        ) {
            Icon(Icons.Filled.Edit, "")
        }
    }
}