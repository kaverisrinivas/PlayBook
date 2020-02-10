package com.example.playnote

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_note.*
import kotlinx.android.synthetic.main.activity_note_save.*

class NoteSaveActivity : AppCompatActivity() {
    private val noteUser:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupViews()
        setListeners()
    }
    private fun setupViews(){
        setContentView(R.layout.activity_note_save)

    }

    private fun setListeners(){
        back_arrow.setOnClickListener {
        finish()
        }
        tv_save.setOnClickListener {
            val description=noteUser?.text.toString().trim()
            val sharedPreference = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.putString("t",it.toString())
            editor.commit()
            Toast.makeText(applicationContext,"Data saved",Toast.LENGTH_LONG).show()
            onBackPressed()

        }
        }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    }


