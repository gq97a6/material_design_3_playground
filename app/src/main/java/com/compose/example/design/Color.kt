package com.compose.example.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.compose.example.toTonalList
import com.google.android.material.color.utilities.CorePalette

//Material source color
val sourceColor = Color(255, 143, 0, 255)
val colorPalette = CorePalette.contentOf(sourceColor.toArgb())

val primaryColor = Color(113, 201, 0, 255)
val secondaryColor = Color(129, 152, 105, 255)
val tertiaryColor = Color(46, 160, 157, 255)
val neutralColor = Color(255, 255, 255, 255)
val neutralVariantColor = Color(255, 255, 255, 255)
val errorColor = Color(255, 84, 73, 255)

//Tonal palettes
val primary = primaryColor.toTonalList()
val secondary = secondaryColor.toTonalList()
val tertiary = tertiaryColor.toTonalList()
val neutral = neutralColor.toTonalList()
val neutralVariant = neutralVariantColor.toTonalList()
val error = errorColor.toTonalList()
val white = Color.White.toTonalList()

//Material tonal palettes
val primaryMaterial = colorPalette.a1.toTonalList()
val secondaryMaterial = colorPalette.a2.toTonalList()
val tertiaryMaterial = colorPalette.a3.toTonalList()
val neutralMaterial = neutralColor.toTonalList()
val neutralVariantMaterial = neutralVariantColor.toTonalList()
val errorMaterial = colorPalette.error.toTonalList()