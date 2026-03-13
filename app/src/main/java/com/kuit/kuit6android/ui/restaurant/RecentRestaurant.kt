package com.kuit.kuit6android.ui.restaurant

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.restaurant.RecentRestaurantData
import com.kuit.kuit6android.ui.home.data.restaurant.RestaurantRatingData

@Composable
fun RecentRestaurant(
    modifier: Modifier = Modifier,
    restaurantDataList: List<RecentRestaurantData>
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = "최근 본 맛집",
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(height = 25.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(22.dp)
        ) {
            items(restaurantDataList) { restaurantData ->
                Box(
                    modifier = Modifier.width(230.dp)
                ) {
                    RestaurantItem(
                        restaurantData = restaurantData
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecentRestaurantPreview() {
    RecentRestaurant(
        restaurantDataList = listOf(
            RecentRestaurantData(
                imageId = R.drawable.img_mosu,
                name = "모수",
                time = 30,
                ratingData = RestaurantRatingData(4.5f, 100)
            ),
            RecentRestaurantData(
                imageId = R.drawable.img_pork_cutlet,
                name = "돈까스",
                time = 20,
                ratingData = RestaurantRatingData(4.8f, 50)
            )
        )
    )
}
