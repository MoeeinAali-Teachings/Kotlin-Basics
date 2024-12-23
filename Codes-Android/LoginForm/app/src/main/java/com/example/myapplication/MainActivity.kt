package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val username: String = etUsername.text.toString()
            val password: String = etPassword.text.toString()
            if (isValidCredentials(username, password)) {
                Toast.makeText(this, "correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "wrong!", Toast.LENGTH_SHORT).show()
            }

        }
    }


    private fun isValidCredentials(username: String, password: String): Boolean {
        val db: HashMap<String, String> = hashMapOf(
            "moeein" to "1234",
            "mamad" to "123"
        )

        if (db[username] == password) {
            return true
        } else {
            return false
        }

    }
}
