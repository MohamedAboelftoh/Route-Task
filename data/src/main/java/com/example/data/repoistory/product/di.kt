package com.example.data.repoistory.product

import com.example.domain.repoistory.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class di {
    @Binds
    abstract fun provideProductRepo(productRepoImpl: ProductRepoImpl):ProductRepository
}