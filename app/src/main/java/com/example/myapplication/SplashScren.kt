package com.example.myapplication

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.view.animation.AnticipateInterpolator
import androidx.core.animation.doOnEnd
import com.example.myapplication.databinding.ActivitySplashScrenBinding

class SplashScren : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScrenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScrenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        splashScreen()
        onClickEvents()
    }

    private fun splashScreen(){
        // This is used to hide the status bar and make
        // the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.

        val titleAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_bounce)
        binding.callImg.startAnimation(titleAnimation)
    }

    private fun onClickEvents(){

    }
}