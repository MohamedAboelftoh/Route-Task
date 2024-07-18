package com.example.routetask.ui.product

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.domain.models.product.ProductsItem
import com.example.routetask.databinding.ProductItemBinding

class ProductAdapter(private var productsList : List<ProductsItem?>?= listOf()) :Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder( val itemBinding : ProductItemBinding) : RecyclerView.ViewHolder(itemBinding.root){
        fun bindData(productsItem: ProductsItem?) {
            itemBinding.product = productsItem
            itemBinding.productDescription.text = productsItem?.description.toString().substring(0,15)+"..."
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ProductItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = productsList?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindData(productsList!![position])
       holder.itemBinding.executePendingBindings()
    }

    fun bindData(it: List<ProductsItem?>?) {
        this.productsList = it
        notifyDataSetChanged()
    }
}