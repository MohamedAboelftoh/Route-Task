package com.example.domain.models.product

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductsItem(

    val images: List<String?>? = null,

    val thumbnail: String? = null,

    val minimumOrderQuantity: Int? = null,

    val rating: String? = null,

    val returnPolicy: String? = null,

    val description: String? = null,

    val weight: Int? = null,

    val warrantyInformation: String? = null,

    val title: String? = null,

    val tags: List<String?>? = null,

    val discountPercentage: String? = null,

    val reviews: List<ReviewsItem?>? = null,

    val price: String? = null,

    val meta: Meta? = null,

    val shippingInformation: String? = null,

    val id: Int? = null,

    val availabilityStatus: String? = null,

    val category: String? = null,

    val stock: Int? = null,

    val sku: String? = null,

    val dimensions: Dimensions? = null,

    val brand: String? = null
) : Parcelable