package com.example.data.api

import com.example.data.models.product.ProductsResponse
import retrofit2.http.GET

interface WebService {
    @GET("products")
    suspend fun getAllProducts() : ProductsResponse
}