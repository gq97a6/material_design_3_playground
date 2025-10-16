package com.compose.example.design

import androidx.compose.ui.graphics.Color
import com.compose.example.toTonalList

val primaryColor = Color(113, 201, 0, 255)
val secondaryColor = Color(129, 152, 105, 255)
val tertiaryColor = Color(46, 160, 157, 255)
val neutralColor = Color(255, 255, 255, 255)
val neutralVariantColor = Color(255, 255, 255, 255)
val errorColor = Color(255, 84, 73, 255)

val primary = primaryColor.toTonalList()
val secondary = secondaryColor.toTonalList()
val tertiary = tertiaryColor.toTonalList()
val neutral = neutralColor.toTonalList()
val neutralVariant = neutralVariantColor.toTonalList()
val error = errorColor.toTonalList()
val white = Color.White.toTonalList()