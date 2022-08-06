package com.vishnevskiypro.retrofitpractice5.data.repository

import com.vishnevskiypro.retrofitpractice5.data.api.RetrofitInstance
import com.vishnevskiypro.retrofitpractice5.model.beznal.Beznalichka
import com.vishnevskiypro.retrofitpractice5.model.nal.Nalichka
import retrofit2.Response

class Repository {

    suspend fun getNalRepo() : Response<Nalichka>{
        return RetrofitInstance.api.getNalMoneyService()
    }

    suspend fun getBeznalRepo() : Response<Beznalichka>{
        return RetrofitInstance.api.getBeznalMoneyService()
    }

}