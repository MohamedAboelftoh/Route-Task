package com.example.domain.models.product

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Meta(

	val createdAt: String? = null,

	val qrCode: String? = null,

	val barcode: String? = null,

	val updatedAt: String? = null
) : Parcelable