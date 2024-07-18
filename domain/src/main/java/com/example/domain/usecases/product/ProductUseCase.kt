package com.example.domain.usecases.product

import com.example.domain.models.product.ProductsItem
import com.example.domain.repoistory.ProductRepository
import javax.inject.Inject

class ProductUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
    suspend fun getProduct():List<ProductsItem?>?{
        return productRepository.getProducts()
    }
}