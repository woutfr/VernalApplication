@file:Suppress("DEPRECATION")

package com.example.vernaljobs

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class FAQ : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)
    }
    fun backToMain(view: View) {

        // Create an Intent to start the second activity
        val registerIntent = Intent(this, MainActivity::class.java)

        // Start the new activity.
        startActivity(registerIntent)
    }
}
