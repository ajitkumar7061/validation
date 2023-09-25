package com.akumar.validation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var emailEditText = intent.extras?.getString("emailEditText").toString()
        val ajit=findViewById<TextView>(R.id.textview)

        ajit.text=emailEditText

    }
}