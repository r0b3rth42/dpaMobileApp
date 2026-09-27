package dev.roberth.appdpa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.roberth.appdpa.presentation.auth.RegisterScreen
import dev.roberth.appdpa.presentation.navigation.AppNavegation
import dev.roberth.appdpa.ui.theme.AppDPATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppDPATheme {
                AppNavegation()
            }
        }
    }
}