@file:Suppress("DEPRECATION")

package com.example.vernaljobs

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Registercompany : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_company)

        lateinit var option: Spinner


        option = findViewById(R.id.spinner) as Spinner
//        result = findViewById(R.id.Spinner_text) as TextView


        val textView = findViewById(R.id.TandC) as TextView
        val options = arrayOf("Delft","Elsewhere")

        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, options)

//        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//                result.text = "Please select an option"
//            }

//            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
//                result.text = options.get(p2)
//            }

        val text = "@string/register_company_TC_text"
        val ss = SpannableString(text)


    }

    fun registerBack(view: View) {

        // Create an Intent to start the second activity
        val registerIntent = Intent(this, MainActivity::class.java)

        // Start the new activity.
        startActivity(registerIntent)
    }
        fun toTermsAndConditions(view: View) {

        // Create an Intent to start the second activity
        val registerIntent = Intent(this, TermsAndConditions::class.java)

        // Start the new activity.
        startActivity(registerIntent)
    }

    fun toPrivacyPolicy(view: View) {

        // Create an Intent to start the second activity
        val registerIntent = Intent(this, PrivacyPolicy::class.java)

        // Start the new activity.
        startActivity(registerIntent)
    }



}




