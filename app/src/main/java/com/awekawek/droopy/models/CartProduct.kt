package com.awekawek.droopy.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity(tableName = "Cart Table")
data class CartProduct(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    val id: Int,

    @ColumnInfo(name = "Name")
    val name: String,

    @ColumnInfo(name = "Price")
    val price: Double,

    @ColumnInfo(name = "Category")
    val description: String,

    @ColumnInfo(name = "ImageUrl")
    val imageUrl: Int?,

    @ColumnInfo(name = "Description")
    val category: String,

    @ColumnInfo(name = "Option")
    val spec: String?,

    @ColumnInfo(name = "In_Stock")
    val inStock: Boolean,

    @ColumnInfo(name = "SKU")
    val modelNumber: String
):Parcelable