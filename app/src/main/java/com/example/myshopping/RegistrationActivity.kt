package com.example.myshopping

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class RegistrationActivity : AppCompatActivity() {
    private lateinit var loginButton: Button
    private lateinit var registarationButton: Button
    private lateinit var emailEditTextField: EditText
    private lateinit var passwordEditTextField: EditText
    private lateinit var confirmPasswordEditTextField: EditText
    private lateinit var errorLoginMessage: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        loginButton = findViewById(R.id.loginButton)
        registarationButton = findViewById(R.id.registrationButton)
        emailEditTextField = findViewById(R.id.emailEditTextField)
        passwordEditTextField = findViewById(R.id.passwordEditTextField)
        confirmPasswordEditTextField = findViewById(R.id.passwordEditTextField)
        errorLoginMessage = findViewById(R.id.errorLoginMessage)


        var loginButton: Button = findViewById(R.id.loginButton)
        var registarationButton: Button = findViewById(R.id.registrationButton)

        var errorLoginMessageText: TextView = findViewById(R.id.errorLoginMessage)

//        loginButton.setOnClickListener {
//            val loginButtonIntent = Intent (this@RegistrationActivity, LoginActivity::class.java)
//            startActivity(loginButtonIntent)
//        }

        fun checkPasswordLenth(passLenth: Int): Boolean {
            val passE = 6
            if (passLenth>passE){
                return true
            }
            println("email less 8 symbols")
            return false

        }
        fun checkLoginLenth(emailLenth: Int): Boolean {
            val loginE = 6
            if (emailLenth>loginE){
                return true
            }
            println("email less 6 symbols")
            return false
        }
        fun chechAttInEmail(emailText: String): Boolean {
            for (char in emailText){
                if (char.toString() == "@"){
                    println(char)
                    return true
                }
            }

            return false
        }

        fun comparePassword(text1: String, text2: String): Boolean{
//            var tex1 = "***"
//            var tex2 = "***"

//                tex1 = text1.toString()
//                tex2 = text2.toString()
                    if (text1 == text2) {
                        println("passwords equals")
                        return true
                    }
            println("p1:"+text1+" p2:"+text2)
            println("passwords NOT equals")
                return false

        }

        registarationButton.setOnClickListener {
            val registrationButtonIntent = Intent(this@RegistrationActivity, LoginActivity::class.java)


            if (checkLoginLenth(emailEditTextField.text.length)
                &&chechAttInEmail(emailEditTextField.text.toString())
                &&checkPasswordLenth(passwordEditTextField.text.length)
                &&comparePassword(passwordEditTextField.text.toString(), confirmPasswordEditTextField.text.toString())){
//                if (emailEditTextField.text.length > 3){
                    println(111111)
                    startActivity(registrationButtonIntent)
                }else {
                    println(22222)
                    errorLoginMessage.text = "Error!!!"
                    errorLoginMessage.setTextColor(Color.parseColor("#b22222"))
                }

        }
    }
}