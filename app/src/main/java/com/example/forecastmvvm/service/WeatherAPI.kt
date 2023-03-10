package com.example.forecastmvvm.service

import com.example.forecastmvvm.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query



interface WeatherAPI {
    @GET()
    fun getData(
       @Query("q") cityName: String
    ):Single<WeatherModel>
}