package com.example.playnote
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class  MainActivity : AppCompatActivity() {

     private lateinit var email: EditText
    private lateinit var password: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        email = findViewById(R.id.edit_text)
        password = findViewById(R.id.edit_text2)
        setupViews()
        setListeners()
    }

    private fun setupViews() {
        setContentView(R.layout.activity_main)

    }

    private fun setListeners() {

        if (email != null && password != null) {
        login_button.setOnClickListener {
            email!!.text.toString()
                val intent = Intent(this, NoteActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

