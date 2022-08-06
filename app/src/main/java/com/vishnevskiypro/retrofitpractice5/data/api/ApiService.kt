package com.vishnevskiypro.retrofitpractice5.data.api

import com.vishnevskiypro.retrofitpractice5.model.beznal.Beznalichka
import com.vishnevskiypro.retrofitpractice5.model.nal.Nalichka
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneyService() : Response<Nalichka>

    @GET("/p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoneyService() : Response<Beznalichka>

}