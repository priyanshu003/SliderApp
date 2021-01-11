package com.example.sliderapp

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        mSelf = this
    }

    companion object {
        private var mSelf: App? = null

        fun self(): App {
            return mSelf!!
        }
    }
}