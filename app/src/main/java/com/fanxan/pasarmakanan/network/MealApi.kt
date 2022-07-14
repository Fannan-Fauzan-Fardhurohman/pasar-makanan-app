package com.fanxan.pasarmakanan.network

import com.fanxan.pasarmakanan.model.MealList
import retrofit2.Call
import retrofit2.http.GET

interface MealApi {
    @GET("random.php")
    fun getRandomFood():Call<MealList>
}