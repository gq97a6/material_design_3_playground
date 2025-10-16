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
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { ColorsPrimary() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { BottomAppBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { Buttons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { Cards() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { Checkboxes() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { Chips() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { DatePickers() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { FloatingActionButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { IconButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { NavigationBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { ProgressIndicators() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { SegmentedButton() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { Sliders() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { Snackbars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { Switches() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { TextFields() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample(
    darkPrimaryColorScheme,
    lightPrimaryColorScheme
) { TimePickers() }