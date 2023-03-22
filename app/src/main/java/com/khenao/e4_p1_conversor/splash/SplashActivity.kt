package com.khenao.e4_p1_conversor.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khenao.e4_p1_conversor.R
import com.khenao.e4_p1_conversor.main.MainActivity
import java.util.*
import kotlin.concurrent.timerTask
import android.annotation.SuppressLint
import android.content.Intent

@SuppressLint("CustomSplashScreen")

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val timer = Timer()
        timer.schedule(
            timerTask {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            },
            1500
        )
    }

}