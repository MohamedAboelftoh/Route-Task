package com.example.data.models.product

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.example.domain.models.product.ProductsItem
import com.google.gson.annotations.SerializedName

@Parcelize
data class ProductsItemDto(

    @field:SerializedName("images")
	val images: List<String?>? = null,

    @field:SerializedName("thumbnail")
	val thumbnail: String? = null,

    @field:SerializedName("minimumOrderQuantity")
	val minimumOrderQuantity: Int? = null,

    @field:SerializedName("rating")
	val rating: String? = null,

    @field:SerializedName("returnPolicy")
	val returnPolicy: String? = null,

    @field:SerializedName("description")
	val description: String? = null,

    @field:SerializedName("weight")
	val weight: Int? = null,

    @field:SerializedName("warrantyInformation")
	val warrantyInformation: String? = null,

    @field:SerializedName("title")
	val title: String? = null,

    @field:SerializedName("tags")
	val tags: List<String?>? = null,

    @field:SerializedName("discountPercentage")
	val discountPercentage: String? = null,

    @field:SerializedName("reviews")
	val reviews: List<ReviewsItemDto?>? = null,

    @field:SerializedName("price")
	val price: String? = null,

    @field:SerializedName("meta")
	val meta: MetaDto? = null,

    @field:SerializedName("shippingInformation")
	val shippingInformation: String? = null,

    @field:SerializedName("id")
	val id: Int? = null,

    @field:SerializedName("availabilityStatus")
	val availabilityStatus: String? = null,

    @field:SerializedName("category")
	val category: String? = null,

    @field:SerializedName("stock")
	val stock: Int? = null,

    @field:SerializedName("sku")
	val sku: String? = null,

    @field:SerializedName("dimensions")
	val dimensions: DimensionsDto? = null,

    @field:SerializedName("brand")
	val brand: String? = null
) : Parcelable{
    fun toProductItem():ProductsItem{
        return ProductsItem(title = title , description = description , thumbnail = thumbnail , rating = rating
            , discountPercentage = discountPercentage,
            price = price
        )
    }
}