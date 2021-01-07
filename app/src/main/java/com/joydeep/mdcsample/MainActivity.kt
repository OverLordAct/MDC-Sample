package com.joydeep.mdcsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.joydeep.mdcsample.databinding.ActivityMainBinding
import com.joydeep.mdcsample.toolbar.BasicToolbarActivity
import com.joydeep.mdcsample.toolbar.CollapsingToolbarActivity
import com.joydeep.mdcsample.toolbar.ScrollingToolbarActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.buttonRegularToolbar.setOnClickListener {
            startActivity(Intent(this, BasicToolbarActivity::class.java))
        }

        binding.buttonScrollingToolbar.setOnClickListener {
            startActivity(Intent(this, ScrollingToolbarActivity::class.java))
        }

        binding.buttonCollapsingToolbar.setOnClickListener {
            startActivity(Intent(this, CollapsingToolbarActivity::class.java))
        }
    }
}