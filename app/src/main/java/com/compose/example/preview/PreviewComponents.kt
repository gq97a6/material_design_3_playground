package com.compose.example.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.PreviewSample
import com.compose.example.compose.components.BottomAppBars
import com.compose.example.compose.components.Buttons
import com.compose.example.compose.components.Cards
import com.compose.example.compose.components.Checkboxes
import com.compose.example.compose.components.Chips
import com.compose.example.compose.components.DatePickers
import com.compose.example.compose.components.FloatingActionButtons
import com.compose.example.compose.components.IconButtons
import com.compose.example.compose.components.NavigationBars
import com.compose.example.compose.components.ProgressIndicators
import com.compose.example.compose.components.SegmentedButton
import com.compose.example.compose.components.Sliders
import com.compose.example.compose.components.Snackbars
import com.compose.example.compose.components.Switches
import com.compose.example.compose.components.TextFields
import com.compose.example.compose.components.TimePickers

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample { BottomAppBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample { Buttons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample { Cards() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample { Checkboxes() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample { Chips() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample { DatePickers() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample { FloatingActionButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample { IconButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample { NavigationBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample { ProgressIndicators() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample { SegmentedButton() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample { Sliders() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample { Snackbars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample { Switches() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample { TextFields() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample { TimePickers() }