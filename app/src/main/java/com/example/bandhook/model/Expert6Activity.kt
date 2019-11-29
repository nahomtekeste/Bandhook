package com.example.bandhook.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bandhook.MainActivity
import com.example.bandhook.R
import kotlinx.android.synthetic.main.activity_joe.*

class Expert6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_joe)


        // this code allow the user to be able to get back to homw page
        btn_back.setOnClickListener {
            var intent = Intent (this , MainActivity::class.java)
            startActivity(intent)
        }
    }
}
