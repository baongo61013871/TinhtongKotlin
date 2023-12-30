package com.example.myapplication.Tuan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R

class Tuan11SecondMainActivity : AppCompatActivity() {
    // khai bao cac controll
    var txt1: EditText? = null
    var txt2: EditText? =null
    var btn1: Button? =null
    var tv1: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan11_main)
        txt1 =findViewById(R.id.tuan11edt1);
        txt2 =findViewById(R.id.tuan11edt2);
        btn1 =findViewById(R.id.tuan11btn1);
        tv1 =findViewById(R.id.tuan11tv2)
        // xu ly su kien
        btn1!!.setOnClickListener(View.OnClickListener {
            tinhtong ()
        })

    }

    private fun tinhtong() {
        // lay du lieu duoc nhap vao tu EditText
            val str1 = txt1!!.text.toString()
        // chuyen sang kieu so
            val so1 =str1.toFloat()
            val str2 = txt2!!.text.toString()
            val so2 =str2.toFloat();

        val tong = so1 + so2
        // in ket qua:
        tv1!!.text = tong.toString()
    }
}