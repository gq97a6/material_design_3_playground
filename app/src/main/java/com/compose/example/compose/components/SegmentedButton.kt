package com.compose.example.compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.PreviewSample

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample { SegmentedButton() }

@Composable
fun SegmentedButton() {
    Column {
        SingleChoiceSegmentedButtonRow {
            repeat(3) { index ->
                SegmentedButton(
                    shape = SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = 3
                    ),
                    onClick = {},
                    selected = index == 0,
                    label = { Text("Label") }
                )
            }
        }

        Spacer(Modifier.height(30.dp))

        SingleChoiceSegmentedButtonRow {
            repeat(4) { index ->
                SegmentedButton(
                    shape = SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = 4
                    ),
                    onClick = {},
                    selected = index == 0,
                    label = { Text("Label") }
                )
            }
        }
    }
}