package com.awekawek.droopy.di

import android.app.Application
import androidx.room.Room
import com.awekawek.droopy.data.cache.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)

@Module
object DatabaseModule {

    @Singleton
    @Provides
    fun providesAppDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "Droopy.db")
            .fallbackToDestructiveMigration()
            .build()
    }

}