package com.compose.example.compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimeInput
import androidx.compose.material3.TimePicker
import androidx.compose.material3.TimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.example.PreviewSample

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample { TimePickers() }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePickers() {
    val state = TimePickerState(0, 0, false)

    Column {
        Surface(
            color = MaterialTheme.colorScheme.surfaceContainerHigh,
            shape = RoundedCornerShape(20.dp)
        ) {
            Column {
                Text(
                    "Select time",
                    Modifier
                        .padding(start = 20.dp)
                        .padding(top = 18.dp),
                    fontSize = 10.sp
                )
                TimePicker(
                    state = state, Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 10.dp)
                )
            }
        }

        Spacer(Modifier.height(30.dp))

        Surface(
            color = MaterialTheme.colorScheme.surfaceContainerHigh,
            shape = RoundedCornerShape(20.dp)
        ) {
            Column {
                TimeInput(
                    state, Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 18.dp)
                )

                Row(
                    Modifier
                        .align(Alignment.End)
                        .padding(bottom = 10.dp)
                        .padding(end = 10.dp)
                ) {
                    TextButton({}, enabled = true) {
                        Text("Cancel")
                    }
                    TextButton({}, enabled = true) {
                        Text("OK")
                    }
                }
            }
        }
    }
}