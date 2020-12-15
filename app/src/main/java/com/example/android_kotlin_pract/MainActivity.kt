package com.example.android_kotlin_pract

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val nameText : EditText = findViewById(R.id.editTextName)
                intent = Intent(applicationContext, SecondActivity::class.java)
                intent.putExtra("name", nameText.text.toString() )
                startActivity(intent)
                /*val inflater = LayoutInflater.from(applicationContext)
                val layout : ViewGroup = inflater.inflate(R.layout.custom_toast, null) as ViewGroup
                val text : TextView = layout.findViewById(R.id.text)
                text.text = "this is toasty"

                with(Toast(applicationContext)) {
                    setGravity(Gravity.CENTER_VERTICAL, 0, 0)
                    duration = Toast.LENGTH_SHORT
                    view = layout
                    show()
                }*/

            }
        })
    }



}