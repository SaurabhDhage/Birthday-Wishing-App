package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
        val name=editTextTextPersonName.editableText.toString();
                    val intent= Intent(this,BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.Name_Extra,name)
            startActivity(intent)
        }
    }
}