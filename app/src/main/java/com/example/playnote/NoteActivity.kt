package com.example.playnote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_note.*

class NoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setupViews()
            setListeners()
        }
        private fun setupViews(){
            setContentView(R.layout.activity_note)

        }

        private fun setListeners(){
            iv_create_note.setOnClickListener {

                val intent = Intent(this,NoteSaveActivity::class.java)
                startActivity(intent)
            }

        }

}

