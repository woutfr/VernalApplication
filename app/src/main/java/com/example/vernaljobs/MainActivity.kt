@file:Suppress("DEPRECATION")

package com.example.vernaljobs

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerMe(view: View) {

        // Create an Intent to start the second activity
        val registerIntent = Intent(this, Register::class.java)

        // Start the new activity.
        startActivity(registerIntent)
    }

    fun goToFAQ(view: View) {

        // Create an Intent to start the second activity
        val registerIntent = Intent(this, FAQ::class.java)

        // Start the new activity.
        startActivity(registerIntent)
    }

    fun goTovacancies(view: View) {

        // Create an Intent to start the second activity
        val registerIntent = Intent(this, Navview::class.java)

        // Start the new activity.
        startActivity(registerIntent)
    }
    fun goToForgotPassword(view: View) {

        // Create an Intent to start the second activity
        val registerIntent = Intent(this, forgotpassword::class.java)

        // Start the new activity.
        startActivity(registerIntent)
    }


}
