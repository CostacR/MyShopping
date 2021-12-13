package com.example.myshopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var shoppingBagImageButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shoppingBagImageButton = findViewById(R.id.shoppingBagImageButton)

        var shoppingBagImageButton: ImageButton = findViewById(R.id.shoppingBagImageButton)

        shoppingBagImageButton.setOnClickListener{
            val shoppingBagImageButtonIntent = Intent(this@MainActivity, RegistrationActivity::class.java)
            startActivity(shoppingBagImageButtonIntent)
        }
    }
}