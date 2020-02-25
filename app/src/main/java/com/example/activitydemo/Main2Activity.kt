package com.example.activitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //get data from intent

        var intent = intent

        val name = intent.getStringExtra("Name")
        val phone = intent.getStringExtra("Phone")
        val email = intent.getStringExtra("Email")

        //textView

         val resultTv = findViewById<TextView>(R.id.resultTv)
         resultTv.text = "Hello "+name+"\nYour Email Id is: "+email+"\nYour Contact no. is : "+phone


    }
}
