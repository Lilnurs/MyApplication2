package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private lateinit var login: TextView
    private lateinit var textemail: EditText
    private lateinit var textpusswod: EditText
    private lateinit var button: Button
    private lateinit var t: TextView
    private lateinit var register: TextView




    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login = findViewById(R.id.login)
        textemail = findViewById(R.id.email)
        textpusswod = findViewById(R.id.password)
        button = findViewById(R.id.button)
        t = findViewById(R.id.t)
        register = findViewById(R.id.register)
        textemail.addTextChangedListener {
            if (textemail.text.toString().isEmpty()){
                button.setBackgroundColor(ContextCompat.getColor(this,R.drawable.bg_button)
            }

    }
}
}