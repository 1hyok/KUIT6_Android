package com.kuit.kuit6android.ui.home.data.restaurant

import kotlinx.serialization.Serializable

@Serializable
data class RestaurantRatingData(
    val rating: Float,
    val raters: Int
)