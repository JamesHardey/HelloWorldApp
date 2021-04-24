package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.increment) as Button
        val btn2 = findViewById<Button>(R.id.decrement) as Button
        val numtext = findViewById<TextView>(R.id.number) as TextView

        btn1.setOnClickListener{
            var num=numtext.text.toString().toInt()
            num++
            numtext.text=num.toString()
        }

        btn2.setOnClickListener{
            var num=numtext.text.toString().toInt()
            if(num>0){
                num--
            }
            numtext.text=num.toString()
        }

    }
}
