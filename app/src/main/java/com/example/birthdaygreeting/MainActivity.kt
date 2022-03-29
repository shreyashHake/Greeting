package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {
        val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
        val intent = Intent(
            this, birthdayGreeting::class.java
        )
        intent.putExtra(birthdayGreeting.NAME_EXTRA, name)

        startActivity(intent)
    }
}