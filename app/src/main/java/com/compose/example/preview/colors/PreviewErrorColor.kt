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
    lightErrorColorScheme,
    darkErrorColorScheme,
    { ColorsError() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { BottomAppBars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { Buttons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { Cards() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { Checkboxes() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { Chips() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { DatePickers() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { FloatingActionButtons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { IconButtons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { NavigationBars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { ProgressIndicators() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { SegmentedButton() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { Sliders() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { Snackbars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { Switches() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { TextFields() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample(
    lightErrorColorScheme,
    darkErrorColorScheme,
    { TimePickers() }
)