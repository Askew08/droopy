package com.awekawek.droopy.mappers

import com.awekawek.droopy.models.CartProduct
import com.awekawek.droopy.models.Product

fun CartProduct.toProduct(): Product {
    return Product(
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