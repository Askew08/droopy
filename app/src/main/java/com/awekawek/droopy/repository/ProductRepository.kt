package com.awekawek.droopy.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.awekawek.droopy.data.cache.AppDatabase
import com.awekawek.droopy.models.Product
import com.awekawek.droopy.util.Constants.TAG
import com.awekawek.droopy.util.Coroutines
import com.awekawek.droopy.util.Seeder
import javax.inject.Inject

class ProductRepository @Inject constructor(private val appDatabase: AppDatabase) {

    private val _productsMutableLiveData = MutableLiveData<MutableList<Product>>()

    init {

        Coroutines.io { fetchProducts() }

        _productsMutableLiveData.observeForever { products ->
            Coroutines.io { saveProducts(products) }
        }

    }

    //Simulates a network call
    private suspend fun fetchProducts() {
        val isProductsCacheAvailable = appDatabase.productDao().isProductCacheAvailable() > 0

        if (!isProductsCacheAvailable) {
            val productsResponse = Seeder().fetchProducts()

            Log.e(TAG, "fetchProducts repository: Products table is null ")

            _productsMutableLiveData.postValue(productsResponse)
        } else return

    }

    //Save the "response" from "network call" to SQLite
    private suspend fun saveProducts(products: MutableList<Product>) =
        appDatabase.productDao().saveProducts(products)

    //Retrieves products stored in SQLite
    fun getProducts() = appDatabase.productDao().getProducts()

}