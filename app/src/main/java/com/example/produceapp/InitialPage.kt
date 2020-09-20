package com.example.produceapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class InitialPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton.setOnClickListener{
            val userName = inputName.text.toString()
            inputName.setText("")
            showUserName.text = userName;
        }
    }
}