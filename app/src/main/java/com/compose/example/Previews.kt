package com.compose.example

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.components.BottomAppBars
import com.compose.example.components.Buttons
import com.compose.example.components.Cards
import com.compose.example.components.Checkboxes
import com.compose.example.components.Chips
import com.compose.example.components.Colors
import com.compose.example.components.ColorsError
import com.compose.example.components.ColorsNeutral
import com.compose.example.components.ColorsPrimary
import com.compose.example.components.ColorsSecondary
import com.compose.example.components.ColorsTertiary
import com.compose.example.components.DatePickers
import com.compose.example.components.FloatingActionButtons
import com.compose.example.components.IconButtons
import com.compose.example.components.NavigationBars
import com.compose.example.components.ProgressIndicators
import com.compose.example.components.SegmentedButton
import com.compose.example.components.Sliders
import com.compose.example.components.Snackbars
import com.compose.example.components.Switches
import com.compose.example.components.TextFields
import com.compose.example.components.TimePickers
import com.compose.example.compose.Theme

@Composable
fun Preview(content: @Composable () -> Unit) {
    Row {
        Theme(darkTheme = false, dynamicColor = false) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                content()
            }
        }
        VerticalDivider()
        Theme(darkTheme = true, dynamicColor = false) {
            Box(
                Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ) {
                content()
            }
        }
    }
}


@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440", showBackground = false)
fun BottomAppBarsPreview() = Preview { BottomAppBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ButtonsPreview() = Preview { Buttons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun CardsPreview() = Preview { Cards() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun CheckboxesPreview() = Preview { Checkboxes() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ChipsPreview() = Preview { Chips() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun DatePickersPreview() = Preview { DatePickers() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun FloatingActionButtonsPreview() = Preview { FloatingActionButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun IconButtonsPreview() = Preview { IconButtons() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun NavigationBarsPreview() = Preview { NavigationBars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ProgressIndicatorsPreview() = Preview { ProgressIndicators() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun SegmentedButtonPreview() = Preview { SegmentedButton() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun SlidersPreview() = Preview { Sliders() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun SnackbarsPreview() = Preview { Snackbars() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun SwitchesPreview() = Preview { Switches() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun TextFieldsPreview() = Preview { TextFields() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun TimePickersPreview() = Preview { TimePickers() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ColorsPreview() = Preview { Colors() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ColorsPrimaryPreview() = Preview { ColorsPrimary() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ColorsSecondaryPreview() = Preview { ColorsSecondary() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ColorsTertiaryPreview() = Preview { ColorsTertiary() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ColorsNeutralPreview() = Preview { ColorsNeutral() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
fun ColorsErrorPreview() = Preview { ColorsError() }