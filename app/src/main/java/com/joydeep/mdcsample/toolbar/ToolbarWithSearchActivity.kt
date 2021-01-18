package com.joydeep.mdcsample.toolbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.joydeep.mdcsample.R
import com.joydeep.mdcsample.adapter.RecyclerAdapter
import com.joydeep.mdcsample.databinding.ActivityToolbarWithSearchBinding
import com.joydeep.mdcsample.utils.showToast
import kotlinx.android.synthetic.main.activity_basic_toolbar.*

class ToolbarWithSearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivityToolbarWithSearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarWithSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setView()
    }

    private fun setView() {
        binding.regularToolbar.setNavigationOnClickListener {
            finish()
        }

        regularToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.icon_1 -> {
                    showToast("Icon 1 clicked")
                    true
                }
                R.id.icon_2 -> {
                    showToast("Icon 2 clicked")
                    true
                }
                R.id.item_1 -> {
                    showToast("Item 1 clicked")
                    true
                }
                R.id.item_2 -> {
                    showToast("Item 2 clicked")
                    true
                }
                R.id.item_3 -> {
                    showToast("Item 3 clicked")
                    true
                }
                else -> false
            }
        }

        binding.recycler.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = RecyclerAdapter()
        }
    }
}