package com.bersyte.weatherapp.api
import com.bersyte.weatherapp.model.WeatherResponse;

import com.bersyte.weatherapp.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather?q=astana&appid=60e3306eccdd8e512ae35a250bb1dc7b")
    suspend fun getWeather(): Response<WeatherResponse>

}