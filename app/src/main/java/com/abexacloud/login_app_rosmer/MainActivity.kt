package com.abexacloud.login_app_rosmer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // EditText
        val textUsername  = findViewById<EditText>(R.id.text_user_name)
        val textPassword  = findViewById<EditText>(R.id.text_password)

        // Buttons
        val btnReset  = findViewById<Button>(R.id.btn_reset)
        val btnSubmit  = findViewById<Button>(R.id.btn_submit)

        btnReset.setOnClickListener {
            textUsername.setText("")
            textPassword.setText("")
        }

        btnSubmit.setOnClickListener {
            if (textUsername.text.isNotBlank() && textPassword.text.isNotBlank()) {

                Toast.makeText(this@MainActivity, "Usuario creado", Toast.LENGTH_LONG).show()

                val intent = Intent(this, UserMenu::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this@MainActivity, "Llene los campos para registrar un usuario", Toast.LENGTH_LONG).show()
            }
        }



    }
}