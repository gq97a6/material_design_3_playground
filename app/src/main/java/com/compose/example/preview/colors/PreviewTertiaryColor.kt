package com.compose.example.preview.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.PreviewSample
import com.compose.example.compose.colors.ColorsTertiary
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
import com.compose.example.design.darkTertiaryColorScheme
import com.compose.example.design.lightTertiaryColorScheme

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsTertiaryPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { ColorsTertiary() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { BottomAppBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { Buttons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { Cards() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { Checkboxes() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { Chips() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { DatePickers() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { FloatingActionButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { IconButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { NavigationBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { ProgressIndicators() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { SegmentedButton() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { Sliders() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { Snackbars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { Switches() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { TextFields() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample(
    darkTertiaryColorScheme,
    lightTertiaryColorScheme
) { TimePickers() }