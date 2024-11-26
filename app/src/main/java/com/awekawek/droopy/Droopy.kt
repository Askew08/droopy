package com.awekawek.droopy

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Droopy : Application(){

    override fun onCreate() {
        super.onCreate()

        //Seeder().fetchProducts() //Seeds the list on app start
    }

}