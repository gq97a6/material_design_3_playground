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
import com.compose.example.design.scheme.darkMaterialColorScheme
import com.compose.example.design.scheme.lightMaterialColorScheme

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
private fun BottomAppBarsPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { BottomAppBars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ButtonsPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { Buttons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CardsPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { Cards() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun CheckboxesPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { Checkboxes() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { Chips() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun DatePickersPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { DatePickers() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun FloatingActionButtonsPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { FloatingActionButtons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun IconButtonsPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { IconButtons() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { NavigationBars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ProgressIndicatorsPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { ProgressIndicators() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SegmentedButtonPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { SegmentedButton() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SlidersPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { Sliders() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SnackbarsPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { Snackbars() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun SwitchesPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { Switches() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TextFieldsPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { TextFields() }
)

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun TimePickersPreview() = PreviewSample(
    lightMaterialColorScheme,
    darkMaterialColorScheme,
    { TimePickers() }
)