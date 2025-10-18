package com.compose.example.preview.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.PreviewSample
import com.compose.example.compose.colors.ColorsPrimary
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
import com.compose.example.design.darkPrimaryColorScheme
import com.compose.example.design.lightPrimaryColorScheme

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsPrimaryPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { ColorsPrimary() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { BottomAppBars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { Buttons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { Cards() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { Checkboxes() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { Chips() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { DatePickers() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { FloatingActionButtons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { IconButtons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { NavigationBars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { ProgressIndicators() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { SegmentedButton() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { Sliders() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { Snackbars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { Switches() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { TextFields() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample(
    lightPrimaryColorScheme,
    darkPrimaryColorScheme,
    { TimePickers() }
)