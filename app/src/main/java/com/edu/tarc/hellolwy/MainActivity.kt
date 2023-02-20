package com.edu.tarc.hellolwy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Load UI to memory
        //R = resources class
        setContentView(R.layout.activity_main)

        //Declare UI varaiable here
        //val = value, var = variable
        val textViewName : TextView = findViewById(R.id.textViewName)
        val imageViewQr : ImageView = findViewById(R.id.qrImage)
        val buttonShow : Button = findViewById(R.id.buttonShow)
        val buttonHide : Button = findViewById(R.id.buttonHide)

        //Declare event Handler
        buttonShow.setOnClickListener{
            textViewName.visibility = View.VISIBLE
            imageViewQr.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener {
            textViewName.visibility = View.INVISIBLE
            imageViewQr.visibility = View.INVISIBLE
        }
    }
}