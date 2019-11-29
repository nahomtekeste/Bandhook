package com.example.bandhook.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bandhook.MainActivity
import com.example.bandhook.R
import kotlinx.android.synthetic.main.activity_napolyon.*

class NapolyonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_napolyon)

        // this code allow the user to be able to get back to home activity
        btn_back.setOnClickListener {
            var intent = Intent (this , MainActivity ::class.java)
            startActivity(intent)
        }
    }
}
