package com.kuit.kuit6android.ui.home.data.restaurant

import kotlinx.serialization.Serializable

@Serializable
data class RestaurantData(
    val imageId: Int,
    val name: String,
    val time: Int,
    val ratingData: RestaurantRatingData
)