package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.ui.favorite.components.TopBar
import com.kuit.kuit6android.ui.home.data.restaurant.RestaurantData
import com.kuit.kuit6android.ui.restaurant.RestaurantItem
import com.kuit.kuit6android.ui.restaurant.RestaurantSamples
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun FavoriteScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    restaurantDataList: List<RestaurantData>,
    onNavigateToBack: () -> Unit,
    onNavigateToRestaurantDetail: (RestaurantData) -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(
                    padding
                )
                .padding(
                    top = 20.dp,
                    start = 27.dp,
                    end = 27.dp
                )
        ) {
            TopBar(title = "즐겨찾기", onNavigateToBack = onNavigateToBack)
            Spacer(Modifier.height(58.dp))
            Text(
                text = "총 ${restaurantDataList.size}개",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        }
        Spacer(Modifier.height(24.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp)
                .background(color = Color.LightGray)
        )
        Spacer(Modifier.height(24.dp))
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 27.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(restaurantDataList) { restaurantData ->
                Box {
                    RestaurantItem(
                        restaurantData = restaurantData,
                        isRecent = false,
                        onNavigateToRestaurantDetail = onNavigateToRestaurantDetail
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteScreenPreview() {
    KUIT6_ANDROIDTheme {
        FavoriteScreen(
            padding = PaddingValues(0.dp),
            restaurantDataList = RestaurantSamples.restaurantDataList,
            onNavigateToBack = {},
            onNavigateToRestaurantDetail = {}
        )
    }
}