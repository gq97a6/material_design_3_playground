package com.compose.example.preview.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.PreviewSample
import com.compose.example.compose.colors.ColorsSecondary
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
import com.compose.example.design.darkSecondaryColorScheme
import com.compose.example.design.lightSecondaryColorScheme

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsSecondaryPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { ColorsSecondary() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { BottomAppBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { Buttons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { Cards() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { Checkboxes() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { Chips() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { DatePickers() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { FloatingActionButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { IconButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { NavigationBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { ProgressIndicators() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { SegmentedButton() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { Sliders() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { Snackbars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { Switches() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { TextFields() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample(
    darkSecondaryColorScheme,
    lightSecondaryColorScheme
) { TimePickers() }