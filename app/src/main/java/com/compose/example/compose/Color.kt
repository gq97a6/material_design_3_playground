package com.compose.example.compose

import androidx.compose.ui.graphics.Color
import com.compose.example.toTonalList

val primaryColor = Color(255, 255, 255, 255)
val secondaryColor = Color(255, 255, 255, 255)
val tertiaryColor = Color(255, 255, 255, 255)
val neutralColor = Color(255, 255, 255, 255)
val neutralVariantColor = Color(255, 255, 255, 255)
val errorColor = Color(255, 0, 0, 255)

val primary = primaryColor.toTonalList()
val secondary = secondaryColor.toTonalList()
val tertiary = tertiaryColor.toTonalList()
val neutral = neutralColor.toTonalList()
val neutralVariant = neutralVariantColor.toTonalList()
val error = errorColor.toTonalList()