package com.example.foodorderingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
//import kotlinx.android.synthetic.main.activity_order_list_page.*

class orderListPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_list_page)
        val tv =findViewById<TextView>(R.id.tv)
        val orderPlaced=intent.getStringExtra(MainActivity.KEY)
        tv.text=orderPlaced.toString()
    }
}