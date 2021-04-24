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
        val myText = findViewById<TextView>(R.id.number) as TextView


        btn1.setOnClickListener {
            incrementNum(myText)
        }

        btn2.setOnClickListener {
            decrementNum(myText)
        }

    }

    private fun incrementNum(myText:TextView){
        var num=myText.text.toString().toInt()
        num++
        myText.text=num.toString()
    }

    private fun decrementNum(myText:TextView){
        var num=myText.text.toString().toInt()
        if(num>0){
            num--
        }
        myText.text=num.toString()
    }
}
