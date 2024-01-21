package com.example.learningtoast

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1=findViewById<Button>(R.id.btn1)
        val button2=findViewById<Button>(R.id.btn2)
        button1.setOnClickListener(){
            Toast.makeText(this, "first button", Toast.LENGTH_SHORT).show()
            val intent=Intent(this,secondactivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener(){
            Toast.makeText(this, " second button", Toast.LENGTH_SHORT).show()
        }
    }


}