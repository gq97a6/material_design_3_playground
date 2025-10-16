package com.compose.example.preview.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.PreviewSample
import com.compose.example.compose.colors.ColorsError
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
import com.compose.example.design.darkErrorColorScheme
import com.compose.example.design.lightErrorColorScheme

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsErrorPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { ColorsError() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { BottomAppBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { Buttons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { Cards() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { Checkboxes() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { Chips() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { DatePickers() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { FloatingActionButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { IconButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { NavigationBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { ProgressIndicators() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { SegmentedButton() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { Sliders() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { Snackbars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { Switches() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { TextFields() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample(
    darkErrorColorScheme,
    lightErrorColorScheme
) { TimePickers() }