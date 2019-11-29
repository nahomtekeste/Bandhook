package com.example.bandhook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bandhook.model.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this code allow the user to get the napolyonactivity
        btn_nabo.setOnClickListener {
            var intent = Intent (this , NapolyonActivity :: class.java)
            startActivity(intent)
        }
        // this code allow the suer to get the nexpertacticity 2
        btn_carni.setOnClickListener {
            var intent = Intent (this , Expret2Activity::class.java)
            startActivity(intent)
        }
        // this code allow the suer to get the nexpertacticity 3
        btn_divid.setOnClickListener {
            var intent = Intent(this , Expert3Activity::class.java)
            startActivity(intent)
        }
        // to thmoas details expert 4
        btn_thoma.setOnClickListener {
            var intent = Intent (this , Expert4Activity::class.java)
            startActivity(intent)
        }// to expert 5
        btn_mather.setOnClickListener {
            var intent = Intent (this , Expert5Activity::class.java)
            startActivity(intent)
        }
        // this code allow the user to be able to get to the joe details
        btn_joe.setOnClickListener {
            var intent = Intent (this , Expert6Activity::class.java)
            startActivity(intent)
        }
        // to get you jeames details
        btn_jemes.setOnClickListener {
            var intent= Intent (this , Expert7Activity ::class.java)
            startActivity(intent)
        }
        // this code allow the user to the details of law expert acivity 8
        btn_law.setOnClickListener {
            var intent = Intent (this , Expert8Activity::class.java)
            startActivity(intent)

        }

    }
}
