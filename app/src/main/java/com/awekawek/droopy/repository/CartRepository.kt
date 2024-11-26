package com.awekawek.droopy.repository

import com.awekawek.droopy.data.cache.AppDatabase
import com.awekawek.droopy.mappers.toCartProduct
import com.awekawek.droopy.models.Product
import javax.inject.Inject

class CartRepository @Inject constructor(private val appDatabase: AppDatabase) {

    suspend fun saveProductToCart(product: Product) =
        appDatabase.cartProductDao().saveProductToCart(product.toCartProduct())

    fun getCartProducts() = appDatabase.cartProductDao().getCartProducts()

    suspend fun clearCart() = appDatabase.cartProductDao().clearCart()

}