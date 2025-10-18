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
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { ColorsSecondary() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { BottomAppBars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { Buttons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { Cards() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { Checkboxes() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { Chips() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { DatePickers() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { FloatingActionButtons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { IconButtons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { NavigationBars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { ProgressIndicators() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { SegmentedButton() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { Sliders() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { Snackbars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { Switches() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { TextFields() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample(
    lightSecondaryColorScheme,
    darkSecondaryColorScheme,
    { TimePickers() }
)