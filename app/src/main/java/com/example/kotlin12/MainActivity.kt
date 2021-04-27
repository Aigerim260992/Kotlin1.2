package com.example.kotlin12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        random_btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        submit_btn.setOnClickListener {
            val intent = Intent( this, SecondActivity::class.java)
            intent.putExtra("msg", edit_text.text.toString())
            startActivity(intent)
        }



    }



}