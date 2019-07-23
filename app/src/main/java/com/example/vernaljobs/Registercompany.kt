package com.example.vernaljobs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity


class Registercompany : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_company)

        lateinit var option: Spinner
//        lateinit var result: TextView

        option = findViewById(R.id.spinner) as Spinner
//        result = findViewById(R.id.Spinner_text) as TextView

        val options = arrayOf("Delft","Elsewhere")

        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, options)

//        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//                result.text = "Please select an option"
//            }

//            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
//                result.text = options.get(p2)
//            }



    }

    fun registerBack(view: View) {

        // Create an Intent to start the second activity
        val registerIntent = Intent(this, MainActivity::class.java)

        // Start the new activity.
        startActivity(registerIntent)

    }


}




