package com.example.routetask.ui.product

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.routetask.R
import com.example.routetask.databinding.ActivityProductsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductsActivity : AppCompatActivity() {
    lateinit var viewBinding : ActivityProductsBinding
    lateinit var viewModel : ProductViewModel
    val productAdapter = ProductAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewModel = ViewModelProvider(this)[ProductViewModel::class.java]
        viewModel.loadProducts()
        viewModel.productsListLiveDat.observe(this){
            productAdapter.bindData(it)
        }
        viewBinding.recyclerView.adapter = productAdapter
    }
}