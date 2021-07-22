package com.example.marveltask.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object API  {
    private const val BASE_URL = "http://gateway.marvel.com/v1/public/"

    private fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}