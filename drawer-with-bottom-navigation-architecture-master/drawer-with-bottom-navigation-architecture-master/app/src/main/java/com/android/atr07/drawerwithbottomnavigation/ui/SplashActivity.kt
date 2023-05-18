package com.android.atr07.Meoww.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.atr07.Meoww.R

import android.content.Intent
import com.android.atr07.Meoww.MainActivity
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {

    private val splashTime = 3000L // Splash screen duration in milliseconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Launch coroutine to delay the launch of the app for a certain amount of time
        CoroutineScope(Dispatchers.Main).launch {
            delay(splashTime)
            launchApp()
        }
    }

    private fun launchApp() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    // Cancel the coroutine if the activity is destroyed to avoid memory leaks
    override fun onDestroy() {
        super.onDestroy()
        CoroutineScope(Dispatchers.Main).cancel()
    }
}