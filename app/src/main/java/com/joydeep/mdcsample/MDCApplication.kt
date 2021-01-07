package com.joydeep.mdcsample

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class MDCApplication: Application() {
    override fun onCreate() {
        // TODO Sample commit
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}