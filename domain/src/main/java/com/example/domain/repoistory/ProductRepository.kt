package com.example.domain.repoistory

import com.example.domain.models.product.ProductsItem

interface ProductRepository {
    suspend fun getProducts():List<ProductsItem?>?
}