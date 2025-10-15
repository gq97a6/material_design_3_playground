package com.compose.example.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.Preview

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun CheckboxesPreview() = Preview { Checkboxes() }

@Composable
fun Checkboxes() {
    Column {
        Row {
            TriStateCheckbox(state = ToggleableState.On, {}, enabled = true)
            TriStateCheckbox(state = ToggleableState.On, {}, enabled = false)
        }

        Row {
            TriStateCheckbox(state = ToggleableState.Indeterminate, {}, enabled = true)
            TriStateCheckbox(state = ToggleableState.Indeterminate, {}, enabled = false)
        }

        Row {
            TriStateCheckbox(state = ToggleableState.Off, {}, enabled = true)
            TriStateCheckbox(state = ToggleableState.Off, {}, enabled = false)
        }
    }
}