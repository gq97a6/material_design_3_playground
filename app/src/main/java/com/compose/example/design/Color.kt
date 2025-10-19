package com.compose.example.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.google.android.material.color.utilities.CorePalette

//Custom colors
val primary = Color(255, 143, 0, 255)
val secondary = Color(216, 160, 112, 255)
val tertiary = Color(109, 127, 25, 255)
val neutral = Color(255, 255, 255, 255)
val neutralVariant = Color(255, 255, 255, 255)
val error = Color(255, 84, 73, 255)

val materialSourceColor = Color(255, 152, 0, 255)
val materialCorePalette = CorePalette.contentOf(materialSourceColor.toArgb())!!

//Material colors
val primaryMaterial = Color(materialCorePalette.a1.keyColor.toInt())
val secondaryMaterial = Color(materialCorePalette.a2.keyColor.toInt())
val tertiaryMaterial = Color(materialCorePalette.a3.keyColor.toInt())
val neutralMaterial = Color(materialCorePalette.n1.keyColor.toInt())
val neutralVariantMaterial = Color(materialCorePalette.n2.keyColor.toInt())
val errorMaterial = Color(materialCorePalette.error.keyColor.toInt())