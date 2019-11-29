package com.example.bandhook.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bandhook.MainActivity
import com.example.bandhook.R
import kotlinx.android.synthetic.main.activity_thomas.*

class Expert4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thomas)

        // this code allow the user to be able to get back to the home page
        btn_back.setOnClickListener {
            var intent = Intent (this , MainActivity::class.java)
            startActivity(intent)
        }
    }
}
