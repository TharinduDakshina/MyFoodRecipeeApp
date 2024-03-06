package com.example.myfoodrecipeeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit=Retrofit.Builder().baseUrl("http://192.168.56.1:8082/RoadRescueBackend/")
    .addConverterFactory(GsonConverterFactory.create()).build()

val recipeService= retrofit.create(ApiService::class.java)

interface ApiService {
    @GET("garage")
    suspend fun getCategories(): CategoriesResponse
}