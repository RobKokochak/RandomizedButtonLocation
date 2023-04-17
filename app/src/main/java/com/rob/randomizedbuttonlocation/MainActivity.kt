package com.rob.randomizedbuttonlocation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.rob.randomizedbuttonlocation.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun randomizeLocation(view: View) {
        val buttonParams = binding.button.layoutParams as ConstraintLayout.LayoutParams
        buttonParams.horizontalBias = Random.nextFloat()
        buttonParams.verticalBias = Random.nextFloat()
        binding.button.layoutParams = buttonParams
    }
}