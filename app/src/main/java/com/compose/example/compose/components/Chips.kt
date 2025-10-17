package com.compose.example.compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CatchingPokemon
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.PreviewSample
import com.compose.example.cs

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ChipsPreview() = PreviewSample { Chips() }

@Composable
fun Chips() {
    Row {
        Column(Modifier) {
            InputChip(enabled = true, selected = false, onClick = {}, label = { Text("Label") })
            InputChip(enabled = true, selected = true, onClick = {}, label = { Text("Label") })
            InputChip(
                enabled = true,
                selected = false,
                onClick = {},
                label = { Text("Label") },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = true,
                selected = true,
                onClick = {},
                label = { Text("Label") },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = true,
                selected = false,
                onClick = {},
                label = { Text("Label") },
                leadingIcon = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = true,
                selected = true,
                onClick = {},
                label = { Text("Label") },
                leadingIcon = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(18.dp)) },
                colors = InputChipDefaults.inputChipColors(selectedLeadingIconColor = cs.onSecondaryContainer)
            )
            InputChip(
                enabled = true,
                selected = false,
                onClick = {},
                label = { Text("Label") },
                leadingIcon = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(18.dp)) },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = true,
                selected = true,
                onClick = {},
                label = { Text("Label") },
                leadingIcon = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(18.dp)) },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) },
                colors = InputChipDefaults.inputChipColors(selectedLeadingIconColor = cs.onSecondaryContainer)
            )
            InputChip(
                enabled = true,
                selected = false,
                onClick = {},
                label = { Text("Label") },
                shape = RoundedCornerShape(100),
                avatar = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(26.dp)) }
            )
            InputChip(
                enabled = true,
                selected = true,
                onClick = {},
                label = { Text("Label") },
                shape = RoundedCornerShape(100),
                avatar = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(26.dp)) }
            )
            InputChip(
                enabled = true,
                selected = false,
                onClick = {},
                label = { Text("Label") },
                shape = RoundedCornerShape(100),
                avatar = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(26.dp)) },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = true,
                selected = true,
                onClick = {},
                label = { Text("Label") },
                shape = RoundedCornerShape(100),
                avatar = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(26.dp)) },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )

            ElevatedAssistChip(enabled = true, onClick = {}, label = { Text("Label") })
        }

        Column(Modifier.padding(start = 20.dp)) {
            InputChip(enabled = false, selected = false, onClick = {}, label = { Text("Label") })
            InputChip(enabled = false, selected = true, onClick = {}, label = { Text("Label") })
            InputChip(
                enabled = false,
                selected = false,
                onClick = {},
                label = { Text("Label") },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = false,
                selected = true,
                onClick = {},
                label = { Text("Label") },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = false,
                selected = false,
                onClick = {},
                label = { Text("Label") },
                leadingIcon = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = false,
                selected = true,
                onClick = {},
                label = { Text("Label") },
                leadingIcon = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = false,
                selected = false,
                onClick = {},
                label = { Text("Label") },
                leadingIcon = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(18.dp)) },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = false,
                selected = true,
                onClick = {},
                label = { Text("Label") },
                leadingIcon = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(18.dp)) },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = false,
                selected = false,
                onClick = {},
                label = { Text("Label") },
                shape = RoundedCornerShape(100),
                avatar = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(26.dp)) }
            )
            InputChip(
                enabled = false,
                selected = true,
                onClick = {},
                label = { Text("Label") },
                shape = RoundedCornerShape(100),
                avatar = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(26.dp)) }
            )
            InputChip(
                enabled = false,
                selected = false,
                onClick = {},
                label = { Text("Label") },
                shape = RoundedCornerShape(100),
                avatar = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(26.dp)) },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )
            InputChip(
                enabled = false,
                selected = true,
                onClick = {},
                label = { Text("Label") },
                shape = RoundedCornerShape(100),
                avatar = { Icon(Icons.Filled.CatchingPokemon, "", Modifier.size(26.dp)) },
                trailingIcon = { Icon(Icons.Filled.Close, "", Modifier.size(18.dp)) }
            )

            ElevatedAssistChip(enabled = false, onClick = {}, label = { Text("Label") })
        }
    }
}