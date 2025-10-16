package com.compose.example.compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.example.PreviewSample

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun NavigationBarsPreview() = PreviewSample { NavigationBars() }

@Composable
fun NavigationBars() {
    Column(Modifier.height(400.dp), verticalArrangement = Arrangement.SpaceAround) {
        NavigationBar {
            NavigationBarItem(
                true,
                {},
                icon = { Icon(Icons.Filled.Circle, "", Modifier.size(12.dp)) },
                label = { Text("Label") }
            )

            NavigationBarItem(
                false,
                {},
                icon = { Icon(Icons.Filled.Circle, "", Modifier.size(12.dp)) },
                label = { Text("Label") }
            )

            NavigationBarItem(
                false,
                {},
                icon = { Icon(Icons.Filled.Circle, "", Modifier.size(12.dp)) },
                label = { Text("Label") }
            )

            NavigationBarItem(
                false,
                {},
                icon = {
                    BadgedBox(badge = { Badge { Text("3") } }) {
                        Icon(Icons.Filled.Mail, "", Modifier.size(25.dp))
                    }
                },
                label = { Text("Label") }
            )
        }

        NavigationBar {
            NavigationBarItem(
                false,
                {},
                icon = { Icon(Icons.Filled.Circle, "", Modifier.size(12.dp)) },
                label = { Text("Label") }
            )

            NavigationBarItem(
                true,
                {},
                icon = {
                    BadgedBox(badge = { Badge { Text("3") } }) {
                        Icon(Icons.Filled.Mail, "", Modifier.size(25.dp))
                    }
                },
                label = { Text("Label") }
            )
        }

        NavigationBar {
            NavigationBarItem(
                false,
                {},
                icon = { Icon(Icons.Filled.Circle, "", Modifier.size(12.dp)) }
            )
            NavigationBarItem(
                false,
                {},
                icon = { Icon(Icons.Filled.Circle, "", Modifier.size(12.dp)) }
            )
            NavigationBarItem(
                false,
                {},
                icon = { Icon(Icons.Filled.Circle, "", Modifier.size(12.dp)) }
            )

            NavigationBarItem(
                false,
                {},
                icon = { Icon(Icons.Filled.Circle, "", Modifier.size(12.dp)) },
                label = { Text("Label") }
            )

            NavigationBarItem(
                true,
                {},
                icon = {
                    BadgedBox(badge = { Badge() }) {
                        Icon(Icons.Filled.Mail, "", Modifier.size(25.dp))
                    }
                },
                label = { Text("Label") }
            )
        }
    }
}