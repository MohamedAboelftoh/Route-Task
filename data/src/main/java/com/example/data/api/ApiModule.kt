package com.example.data.api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
//import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
//    @Provides
//    @Singleton
//    fun provideHttpLoggingInterceptor():HttpLoggingInterceptor{
//        val httpLoggingInterceptor =  HttpLoggingInterceptor {
//            Log.e("api" , it)
//        }
//            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
//        return httpLoggingInterceptor
//    }
//    @Provides
//    @Singleton
//    fun provideOhHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor):OkHttpClient{
//        return OkHttpClient.Builder()
//            .addInterceptor(httpLoggingInterceptor)
//            .build()
//    }
//  https://dummyjson.com/products
    @Provides
    @Singleton
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Provides
    @Singleton
    fun provideWebService(retrofit: Retrofit):WebService{
        return retrofit.create(WebService::class.java)
    }
}