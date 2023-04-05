package com.abexacloud.login_app_rosmer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class UserMenu: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_page_layout)

        var watchMaps  = findViewById<Button>(R.id.btn_maps)

        watchMaps.setOnClickListener {
            Toast.makeText(this@UserMenu, "Usuario creado", Toast.LENGTH_LONG).show()

            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }
}