package com.akumar.validation



import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val register = findViewById<Button>(R.id.register)
        val nameEditText = findViewById<EditText>(R.id.enterName_editText)
        val emailEditText = findViewById<EditText>(R.id.enterEmail_editText)
        val addressEditText = findViewById<EditText>(R.id.enterAddress_editText)


        register.setOnClickListener {


            val text = nameEditText.text.toString()

            val splite = emailEditText.text.toString().split(" ")
            Toast.makeText(this@MainActivity, "${splite[0]}", Toast.LENGTH_SHORT).show()
            var numCount = 0
            var capitalLetter = 0
            var smallLetter = 0
            var specialChar = 0

            for (i in text) {
                for (j in 0..9) {
                    if (i.toString() == j.toString()) {
                        numCount++;
                    }
                }
            }

            for (i in text) {
                for (j in 'A'..'Z') {
                    if (i.toString() == j.toString()) {
                        capitalLetter++;
                    }
                }
            }

            for (i in text) {
                for (j in 'a'..'z') {
                    if (i.toString() == j.toString()){
                        smallLetter++;
                    }
                }
            }

            for (i in text) {
                for (j in "@$!*&^_+)(`~#") {
                    if (i.toString() == j.toString()) {
                        specialChar++;
                    }
                }
            }


            if (numCount == 0) {
                Toast.makeText(this, "Please enter Number in Email", Toast.LENGTH_SHORT).show()
            } else if (smallLetter == 0) {
                Toast.makeText(this, "Please enter Small letter in Email", Toast.LENGTH_SHORT)
                    .show()
            } else if (capitalLetter == 0) {
                Toast.makeText(this, "Please enter Capital letter in Email", Toast.LENGTH_SHORT)
                    .show()
            } else if (specialChar == 0) {
                Toast.makeText(this, "Please enter Special Char in Email", Toast.LENGTH_SHORT)
                    .show()
            }


            //val lastIndex = text.lastIndex
            // Toast.makeText(this, ""+ text[0]  + text[lastIndex], Toast.LENGTH_SHORT).show()

//        For Password Validation


            val text1 = addressEditText.text.toString()

            var numCount1 = 0
            var capitalLetter1 = 0
            var smallLetter1 = 0
            var specialChar1 = 0

            for (i in text1) {
                for (j in 0..9) {
                    if (i.toString() == j.toString()) {
                        numCount1++;
                    }
                }
            }

            for (i in text1) {
                for (j in 'A'..'Z') {
                    if (i.toString() == j.toString()) {
                        capitalLetter1++;
                    }
                }
            }

            for (i in text1) {
                for (j in 'a'..'z') {
                    if (i.toString() == j.toString()) {
                        smallLetter1++;
                    }
                }
            }
            for (i in text1) {
                for (j in "@$!*&^_+)(`~#") {
                    if (i.toString() == j.toString()) {
                        specialChar1++;
                    }
                }
            }
            if (numCount1 == 0) {
                Toast.makeText(this, "Please enter Number in password", Toast.LENGTH_SHORT).show()
            } else if (smallLetter1 == 0) {
                Toast.makeText(this, "Please enter Small letter in password", Toast.LENGTH_SHORT)
                    .show()
            } else if (capitalLetter1 == 0) {
                Toast.makeText(this, "Please enter Capital letter in password", Toast.LENGTH_SHORT)
                    .show()
            } else if (specialChar1 == 0) {
                Toast.makeText(this, "Please enter Special Char in password", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("emailEditText","${splite[0]}")
                startActivity(intent)
            }
        }

    }

}