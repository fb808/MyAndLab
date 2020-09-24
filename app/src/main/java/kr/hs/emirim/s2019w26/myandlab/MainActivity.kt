package kr.hs.emirim.s2019w26.myandlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.security.identity.AccessControlProfile
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    lateinit var mProfile : ImageView
    lateinit var mbutton1 : Button
    lateinit var mbutton2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mProfile = findViewById(R.id.profile)
        mbutton1 = findViewById(R.id.button1)
        mbutton2 = findViewById(R.id.button2)

        mbutton1.setOnClickListener {
            val intent = Intent(this, FourbuttonActivity::class.java)
            startActivity(intent)
        }

        mbutton2.setOnClickListener{
            val intent = Intent(this, Fourbutton2Activity::class.java)
            startActivity(intent)
        }
    }
}