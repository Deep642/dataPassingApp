package com.example.foodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        const val KEY="com.example.foodorderingapp.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val orderBtn=findViewById<Button>(R.id.orderBtn)
        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val et3=findViewById<EditText>(R.id.et3)
        orderBtn.setOnClickListener {
            val orderList=et1.text.toString()+" "+et2.text.toString()+" "+et3.text.toString()

            intent=Intent(this,orderListPage::class.java)
            intent.putExtra(KEY,orderList)    //important line for passing the data
            startActivity(intent)
        }
    }
}