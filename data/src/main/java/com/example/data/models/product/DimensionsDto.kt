package com.example.data.models.product

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class DimensionsDto(

	@field:SerializedName("depth")
	val depth: String? = null,

	@field:SerializedName("width")
	val width: String? = null,

	@field:SerializedName("height")
	val height: String? = null
) : Parcelable