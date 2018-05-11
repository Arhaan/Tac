package com.example.arhaan.tac

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_open.*

class OpenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open)
        var b1 =findViewById<Button>(R.id.button2)
        b1.setOnClickListener{
            val intent = Intent(this, Game::class.java)
            startActivity(intent)
        }

    }


}
