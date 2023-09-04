package com.example.testhotelapp.data.api

import com.example.testhotelapp.data.models.InfoHotel
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

internal interface HotelApi {
    @GET("./v3/35e0d18e-2521-4f1b-a575-f0fe366f66e3")
    suspend fun getInfoHotel(): InfoHotel

}