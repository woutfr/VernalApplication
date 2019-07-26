@file:Suppress("DEPRECATION")

package com.example.vernaljobs

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
// ojojojojdfad

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

        val text = "Check the box if you agree with the Terms & Conditions and the Privacy Policy"
        val ss = SpannableString(text)
        val clickableSpan1 = object: ClickableSpan() {
            override fun onClick(widget:View) {
                Toast.makeText(this@Registercompany, "Terms & Conditions", Toast.LENGTH_SHORT).show()
            }
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.setColor(Color.BLUE)
                ds.setUnderlineText(false)
            }
        }
        val clickableSpan2 = object:ClickableSpan() {
            override fun onClick(widget:View) {
                Toast.makeText(this@Registercompany, "Privacy Policy", Toast.LENGTH_SHORT).show()
            }
        }
        ss.setSpan(clickableSpan1, 7, 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(clickableSpan2, 16, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.setText(ss)
        textView.setMovementMethod(LinkMovementMethod.getInstance())

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




