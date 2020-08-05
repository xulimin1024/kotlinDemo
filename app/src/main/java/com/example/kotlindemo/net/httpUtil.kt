package com.example.kotlindemo.net

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

object ServiceCreater {
    private const val BASE_URL = "http://image.so.com/"
    private val retrofit =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
    fun <T> create(serviceClass: Class<T>):T = retrofit.create(serviceClass)
}

interface AppService {
    @GET("j")
    fun getAppData(@Query("q") food: String): Call<App>
}