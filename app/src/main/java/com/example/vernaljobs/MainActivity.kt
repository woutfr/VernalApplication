package com.example.vernaljobs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.vernaljobs.FAQ
import com.example.vernaljobs.Register
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {


//    lateinit var ButtonHoverMe: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        ButtonHoverMe = findViewById(R.id.login_button)
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
