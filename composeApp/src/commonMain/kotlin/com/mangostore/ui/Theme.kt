package com.mangostore.ui

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Frutiger Aero color palette 🌊
val AquaPrimary = Color(0xFF00BCD4)
val AquaLight = Color(0xFF80DEEA)
val AquaDark = Color(0xFF0097A7)
val MangoAccent = Color(0xFFFFB300)
val GrassGreen = Color(0xFF66BB6A)
val SkyBlue = Color(0xFF81D4FA)
val CloudWhite = Color(0xFFF5FBFF)

private val LightColorScheme = lightColorScheme(
    primary = AquaPrimary,
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFB2EBF2),
    onPrimaryContainer = Color(0xFF003F47),
    secondary = MangoAccent,
    onSecondary = Color(0xFF1A1000),
    secondaryContainer = Color(0xFFFFECB3),
    onSecondaryContainer = Color(0xFF2D1E00),
    tertiary = GrassGreen,
    background = Color(0xFFE3F2FD),
    onBackground = Color(0xFF1A1A2E),
    surface = Color(0xFFF5FBFF),
    onSurface = Color(0xFF1A1A2E),
    surfaceVariant = Color(0xFFDCF0F8),
    onSurfaceVariant = Color(0xFF3A4A52),
    error = Color(0xFFBA1A1A),
    outline = Color(0xFF8ECAD8)
)

private val DarkColorScheme = darkColorScheme(
    primary = AquaLight,
    onPrimary = Color(0xFF003F47),
    primaryContainer = AquaDark,
    onPrimaryContainer = AquaLight,
    secondary = MangoAccent,
    onSecondary = Color(0xFF1A1000),
    secondaryContainer = Color(0xFF3D2800),
    onSecondaryContainer = Color(0xFFFFE082),
    tertiary = GrassGreen,
    background = Color(0xFF0A1628),
    onBackground = Color(0xFFE3F2FD),
    surface = Color(0xFF0D2137),
    onSurface = Color(0xFFE3F2FD),
    surfaceVariant = Color(0xFF1A3347),
    onSurfaceVariant = Color(0xFF8ECAD8),
    error = Color(0xFFFF5252),
    outline = Color(0xFF2A4A5A)
)

@Composable
fun MangoStoreTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography(),
        content = content
    )
}
 