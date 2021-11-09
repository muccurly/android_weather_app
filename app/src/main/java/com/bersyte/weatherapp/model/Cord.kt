package com.bersyte.weatherapp.model;

import com.google.gson.annotations.SerializedName

class Cord {
    @SerializedName("lon")
    var lon: Float = 0.toFloat()
    @SerializedName("lat")
    var lat: Float = 0.toFloat()
}