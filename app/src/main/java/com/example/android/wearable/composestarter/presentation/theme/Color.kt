/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.wearable.composestarter.presentation.theme

import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.Colors

val MedicalCyan = Color(0xFF01A0AD)
val WhiteOff = Color(0xFFF3F3F3)
val Gray = Color(0xFFE6E6E6)
val AmbientCyan = Color(0xFFEFF4F5)
val GraphiteBlack = Color(0xFF2C2C2C)
val Red400 = Color(0xFFCF6679)

internal val wearColorPalette: Colors = Colors(
    primary = WhiteOff,
    primaryVariant = AmbientCyan,
    secondary = MedicalCyan,
    secondaryVariant = Gray,
    error = Red400,
    onPrimary = GraphiteBlack,
    onSecondary = GraphiteBlack,
    onError = GraphiteBlack
)