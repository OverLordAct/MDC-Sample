package com.joydeep.mdcsample.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joydeep.materialdesignsample.utils.showToast
import com.joydeep.mdcsample.R
import kotlinx.android.synthetic.main.activity_basic_toolbar.*

class BasicToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_toolbar)

        regularToolbar.setNavigationOnClickListener {
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
    }
}