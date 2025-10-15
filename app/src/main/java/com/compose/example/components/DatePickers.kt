package com.compose.example.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DisplayMode
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.Preview

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun DatePickersPreview() = Preview { DatePickers() }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickers() {
    val state1 = rememberDatePickerState()
    val state2 = rememberDatePickerState()
    state2.displayMode = DisplayMode.Input

    Column {
        DatePicker(state1)
        Spacer(Modifier.height(20.dp))
        DatePicker(state2)
    }
}