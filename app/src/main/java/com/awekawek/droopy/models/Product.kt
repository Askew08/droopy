package com.awekawek.droopy.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity(tableName = "Product Table")
data class Product(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    val id: Int,

    @ColumnInfo(name = "Name")
    val name: String,

    @ColumnInfo(name = "Price")
    val price: Double,

    @ColumnInfo(name = "Description")
    val description: String,

    @ColumnInfo(name = "ImageUrl")
    val imageUrl: Int?, //or String

    @ColumnInfo(name = "Category")
    val category: String,

    @ColumnInfo(name = "option")
    val spec: String?,

    @ColumnInfo(name = "In_Stock")
    val inStock: Boolean,

    @ColumnInfo(name = "SKU")
    val modelNumber: String
):Parcelable