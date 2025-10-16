package com.compose.example.compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Fingerprint
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.PreviewSample

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample { TextFields() }

@Composable
fun TextFields() {
    val state = TextFieldState("Input")
    val lead = @Composable { Icon(Icons.Filled.Fingerprint, "") }
    val trail = @Composable { Icon(Icons.Filled.Close, "") }
    val error = @Composable { Icon(Icons.Filled.Warning, "") }
    val focusRequester = remember { FocusRequester() }

    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }

    Column(Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceAround) {
        TextField(
            state,
            Modifier.focusRequester(focusRequester),
            label = { Text("Label") },
            leadingIcon = lead
        )
        TextField(
            state,
            Modifier,
            label = { Text("Label") },
            leadingIcon = lead,
            trailingIcon = trail
        )
        TextField(
            state,
            Modifier,
            label = { Text("Label") },
            leadingIcon = lead,
            supportingText = { Text("Supporting text") })
        TextField(
            state,
            Modifier,
            label = { Text("Label") },
            leadingIcon = lead,
            supportingText = { Text("Supporting text") },
            enabled = false
        )
        TextField(
            state,
            Modifier,
            label = { Text("Label") },
            leadingIcon = lead,
            supportingText = { Text("Error found") },
            isError = true,
            trailingIcon = error
        )

        OutlinedTextField(
            state,
            Modifier.focusRequester(focusRequester),
            label = { Text("Label") },
            leadingIcon = lead
        )
        OutlinedTextField(
            state,
            Modifier,
            label = { Text("Label") },
            leadingIcon = lead,
            trailingIcon = trail
        )
        OutlinedTextField(
            state,
            Modifier,
            label = { Text("Label") },
            leadingIcon = lead,
            supportingText = { Text("Supporting text") })
        OutlinedTextField(
            state,
            Modifier,
            label = { Text("Label") },
            leadingIcon = lead,
            supportingText = { Text("Supporting text") },
            enabled = false
        )
        OutlinedTextField(
            state,
            Modifier,
            label = { Text("Label") },
            leadingIcon = lead,
            supportingText = { Text("Error found") },
            isError = true,
            trailingIcon = error
        )
    }
}