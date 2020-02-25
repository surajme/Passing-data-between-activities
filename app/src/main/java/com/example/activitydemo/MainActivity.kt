package com.example.activitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Create", "onCreate Called")

        setContentView(R.layout.activity_main)

        val nameET = findViewById<EditText>(R.id.nameEt)
        val phoneEt = findViewById<EditText>(R.id.phoneEt)
        val emailEt = findViewById<EditText>(R.id.emailEt)
        val saveBtn = findViewById<Button>(R.id.saveBtn)

        //Handle button click

        saveBtn.setOnClickListener {

            //get texts from editTexts
            val name = nameET.text.toString()
            val phone = phoneEt.text.toString()
            val email = emailEt.text.toString()

            //intent to start new activity

            val intent = Intent (this, Main2Activity:: class.java)

            intent.putExtra("Name", name)
            intent.putExtra("Phone", phone)
            intent.putExtra("Email", email)

            startActivity(intent)



        }
    }

    override fun onResume() {
        super.onResume()

        Log.d("resume", "onResume Called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("start", "onStart Called")

    }

    override fun onStop() {
        super.onStop()
        Log.d("stop", "onStop Called")

    }

    override fun onPause() {
        super.onPause()
        Log.d("pause", "onPause Called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("destroy", "onDestroy Called")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Restart", "onRestart Called")

    }
}
