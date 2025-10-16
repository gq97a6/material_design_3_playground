package com.compose.example.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.example.PreviewSample
import com.compose.example.compose.colors.Colors
import com.compose.example.compose.colors.ColorsError
import com.compose.example.compose.colors.ColorsNeutral
import com.compose.example.compose.colors.ColorsPrimary
import com.compose.example.compose.colors.ColorsSecondary
import com.compose.example.compose.colors.ColorsTertiary

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsPreview() = PreviewSample { Colors() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsPrimaryPreview() = PreviewSample { ColorsPrimary() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsSecondaryPreview() = PreviewSample { ColorsSecondary() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsTertiaryPreview() = PreviewSample { ColorsTertiary() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsNeutralPreview() = PreviewSample { ColorsNeutral() }

@Composable
@Preview(device = "spec:width=2160px,height=2341px,dpi=440")
private fun ColorsErrorPreview() = PreviewSample { ColorsError() }