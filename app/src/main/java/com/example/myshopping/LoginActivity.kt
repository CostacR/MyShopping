package com.example.myshopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var registrationButton: Button
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        registrationButton = findViewById(R.id.registrationButton)
        loginButton = findViewById(R.id.loginButton)
        passwordEditText = findViewById(R.id.passwordEditTextField)
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditTextField)

        var registrationButton: Button = findViewById(R.id.registrationButton)
        var loginButton: Button = findViewById(R.id.loginButton)

        registrationButton.setOnClickListener {
            val intentRegistration = Intent(this@LoginActivity, LoginActivity::class.java)
            startActivity(intentRegistration)

        }

        loginButton.setOnClickListener {
            val intentLogin = Intent(this@LoginActivity, LoginActivity::class.java)
            startActivity(intentLogin)
        }

    }
}