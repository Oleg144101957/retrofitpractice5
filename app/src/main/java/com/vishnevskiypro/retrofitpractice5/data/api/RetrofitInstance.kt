package com.vishnevskiypro.retrofitpractice5.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api by lazy {

        Retrofit.Builder()
            .baseUrl("https://api.privatbank.ua")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}