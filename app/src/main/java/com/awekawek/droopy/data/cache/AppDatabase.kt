package com.awekawek.droopy.data.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import com.awekawek.droopy.data.cache.dao.CartProductDao
import com.awekawek.droopy.data.cache.dao.ProductDao
import com.awekawek.droopy.data.cache.dao.UserDao
import com.awekawek.droopy.models.CartProduct
import com.awekawek.droopy.models.Product
import com.awekawek.droopy.models.User

@Database(entities = [User::class, Product::class, CartProduct::class], version = 4, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    abstract fun productDao(): ProductDao

    abstract fun cartProductDao():CartProductDao

}