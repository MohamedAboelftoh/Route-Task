package com.example.routetask.ui.common

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.routetask.R

@BindingAdapter("app:url")
fun bindUrlImage(imageView: ImageView , url : String){
    Glide.with(imageView).load(url)
        .placeholder(R.drawable.img_product)
        .into(imageView);
}