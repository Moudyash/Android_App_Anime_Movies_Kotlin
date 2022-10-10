package com.moudy.tanellomovieanimeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import com.moudy.tanellomovieanimeapp.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
     private lateinit var binding:ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val animationleft = AnimationUtils.loadAnimation(this, R.anim.from_left)
        val animationright= AnimationUtils.loadAnimation(this, R.anim.from_right)
        val fadein= AnimationUtils.loadAnimation(this, R.anim.fadein)
        val bounce= AnimationUtils.loadAnimation(this, R.anim.blink)
        val rotate= AnimationUtils.loadAnimation(this, R.anim.rotate)

        Handler().postDelayed({
            binding.slide1.visibility= View.VISIBLE
            binding.slide1.startAnimation(animationleft)

        }, 1000)
        Handler().postDelayed({
            binding.slide2.visibility= View.VISIBLE

            binding.slide2.startAnimation(animationright)

        }, 1500)
        Handler().postDelayed({
            binding.slide3.visibility= View.VISIBLE

            binding.slide3.startAnimation(animationleft)

        }, 2000)
        Handler().postDelayed({
            binding.bgshape.visibility= View.VISIBLE

            binding.bgshape.startAnimation(fadein)

            binding.title.visibility= View.VISIBLE
            binding.title.startAnimation(fadein)


        }, 2500)
        Handler().postDelayed({
            binding.desc.visibility= View.VISIBLE
            binding.desc.startAnimation(fadein)
            binding.title.clearAnimation()


        }, 3000)
        Handler().postDelayed({
            binding.desc.clearAnimation()

            binding.btn1.visibility= View.VISIBLE
            binding.btn2.visibility= View.VISIBLE
            binding.btn2.startAnimation(fadein)
            binding.btn1.startAnimation(fadein)


        }, 3500)
        Handler().postDelayed({
            binding.blur.visibility= View.VISIBLE
            binding.btntext.visibility= View.VISIBLE

            binding.blur.startAnimation(bounce)
            binding.btntext.startAnimation(fadein)

        }, 4000)
    }
}