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
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { ColorsTertiary() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { BottomAppBars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { Buttons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { Cards() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { Checkboxes() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { Chips() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { DatePickers() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { FloatingActionButtons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { IconButtons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { NavigationBars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { ProgressIndicators() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { SegmentedButton() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { Sliders() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { Snackbars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { Switches() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { TextFields() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample(
    lightTertiaryColorScheme,
    darkTertiaryColorScheme,
    { TimePickers() }
)