package com.example.a23012021015_mad_assignment1

import android.content.Intent
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import android.widget.ImageView
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val ivLogo = findViewById<ImageView>(R.id.ivLogo)
        val tvHeading = findViewById<TextView>(R.id.tvHeading)
        val tvDesc = findViewById<TextView>(R.id.tvDesc)
        val btnStart = findViewById<MaterialButton>(R.id.btnStart)

        // Fade-in animation
        val fadeIn = AlphaAnimation(0f, 1f)
        fadeIn.duration = 1500
        fadeIn.fillAfter = true

        ivLogo.startAnimation(fadeIn)
        tvHeading.startAnimation(fadeIn.apply { startOffset = 500 })
        tvDesc.startAnimation(fadeIn.apply { startOffset = 1000 })
        btnStart.startAnimation(fadeIn.apply { startOffset = 1500 })

        btnStart.setOnClickListener {
            startActivity(Intent(this, MainBottomNavActivity::class.java))
            finish()
        }
    }
}
