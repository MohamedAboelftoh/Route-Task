package com.example.data.repoistory.product

import com.example.data.api.WebService
import com.example.domain.models.product.ProductsItem
import com.example.domain.repoistory.ProductRepository
import javax.inject.Inject

class ProductRepoImpl @Inject constructor(private val webService: WebService) : ProductRepository {
    override suspend fun getProducts(): List<ProductsItem?>? {
      val response = webService.getAllProducts().products
        return response?.map {
            it?.toProductItem()
        }
    }
}