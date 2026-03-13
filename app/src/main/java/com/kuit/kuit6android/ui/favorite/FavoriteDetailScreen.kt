package com.kuit.kuit6android.ui.favorite

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit6android.ui.favorite.components.TopBar
import com.kuit.kuit6android.ui.home.data.restaurant.RestaurantData

@Composable
fun FavoriteDetailScreen(
    modifier: Modifier = Modifier,
    restaurantData: RestaurantData,
    onNavigateToBack: () -> Unit
) {
    Column {
        TopBar(onNavigateToBack = onNavigateToBack)
    }
}