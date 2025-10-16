package com.compose.example.preview.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.PreviewSample
import com.compose.example.compose.colors.ColorsNeutral
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
import com.compose.example.design.darkNeutralColorScheme
import com.compose.example.design.lightNeutralColorScheme

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsNeutralPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { ColorsNeutral() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { BottomAppBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { Buttons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { Cards() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { Checkboxes() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { Chips() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { DatePickers() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { FloatingActionButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { IconButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { NavigationBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { ProgressIndicators() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { SegmentedButton() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { Sliders() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { Snackbars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { Switches() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { TextFields() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample(
    darkNeutralColorScheme,
    lightNeutralColorScheme
) { TimePickers() }