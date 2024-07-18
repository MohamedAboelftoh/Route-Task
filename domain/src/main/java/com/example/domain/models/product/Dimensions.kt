package com.example.domain.models.product

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Dimensions(

	val depth: String? = null,

	val width: String? = null,

	val height: String? = null
) : Parcelable