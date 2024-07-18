package com.example.routetask.ui.product

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.models.product.ProductsItem
import com.example.domain.usecases.product.ProductUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val productUseCase: ProductUseCase
) : ViewModel() {
    val productsListLiveDat = MutableLiveData<List<ProductsItem?>?>()
    fun loadProducts(){
        viewModelScope.launch {
            try {
                val response = productUseCase.getProduct()
                productsListLiveDat.postValue(response)
            }catch (e : Exception){
                Log.e("api", e.localizedMessage)
            }
        }
    }
}