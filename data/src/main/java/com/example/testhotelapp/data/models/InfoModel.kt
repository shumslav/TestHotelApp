package com.example.testhotelapp.data.models

import com.google.gson.annotations.SerializedName

data class InfoHotel(
    val id:Int,
    val name:String,
    val adress:String,
    @SerializedName("minimal_price") val minimalPrice:String,
    @SerializedName("price_for_it") val priceForIt:String,
    val rating:Int,
    @SerializedName("rating_name") val ratingName:String,
    @SerializedName("image_urls") val imageUrls:List<String>,
    @SerializedName("about_the_hotel") val aboutHotel: MoreAboutHotel
){
    data class MoreAboutHotel(
        val description:String,
        val peculiarities: List<String>
    )
}
