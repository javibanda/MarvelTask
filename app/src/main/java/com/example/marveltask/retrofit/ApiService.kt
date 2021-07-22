package com.example.marveltask.retrofit

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface ApiService {

    @GET("characters?ts=1&apikey=6253edfe88d0a0142ee64ad46a162160&hash=97bc35c8096b31be0da8bd253480c66f")
    fun getCharacters(): Response<Retrofit>
}