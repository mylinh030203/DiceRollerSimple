package com.example.dicerollersimple

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
//import kotlinx.coroutines.*
//import kotlinx.coroutines.runBlocking



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       Anhxa()

    }

    fun Anhxa() {
        val mp: MediaPlayer = MediaPlayer.create(this, R.raw.roll)
        val tvHelp: TextView = findViewById(R.id.tvHelp)
        val rollAnimations: Int = 10;
        val diceContainer: LinearLayout = findViewById(R.id.diceContainer)
        val die1: ImageView = findViewById(R.id.die1)
        val die2: ImageView = findViewById(R.id.die2)

        diceContainer.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                for (i in 0..rollAnimations - 1) {
                    die1.setImageResource((R.drawable.mat1..R.drawable.mat6).random())
                    die2.setImageResource((R.drawable.mat1..R.drawable.mat6).random())
                }
                if(mp!=null)
                {
                    mp.start()
                }
            }

        })

    }


}