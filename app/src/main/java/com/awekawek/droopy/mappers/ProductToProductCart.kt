package com.awekawek.droopy.mappers

import com.awekawek.droopy.models.CartProduct
import com.awekawek.droopy.models.Product

fun Product.toCartProduct(): CartProduct {
    return CartProduct(
        this.id,
        this.name,
        this.price,
        this.description,
        this.imageUrl,
        this.category,
        this.spec,
        this.inStock,
        this.modelNumber
    )
}