package com.kuit.kuit6android.ui.home.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.component.AddressRow
import com.kuit.kuit6android.ui.home.component.Category.CategoryRow
import com.kuit.kuit6android.ui.home.component.GetCouponItem
import com.kuit.kuit6android.ui.home.component.GoToOrderRow
import com.kuit.kuit6android.ui.home.component.SearchTextField
import com.kuit.kuit6android.ui.home.component.restaurant.RecentRestaurant
import com.kuit.kuit6android.ui.home.data.restaurant.RecentRestaurantData
import com.kuit.kuit6android.ui.home.data.restaurant.RestaurantRatingData

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    padding: PaddingValues
) {
    val restaurantDataList = listOf(
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
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(
                padding
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            GetCouponItem()
            Spacer(modifier = Modifier.height(height = 20.dp))
            AddressRow(modifier = Modifier.padding(horizontal = 27.dp))
            SearchTextField(
                modifier = Modifier.padding(horizontal = 49.dp)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(
                    horizontal = 27.dp
                )
            ) {
                CategoryRow()
                Spacer(
                    modifier = Modifier
                        .height(height = 14.dp)
                )
                CategoryRow()
                Spacer(
                    modifier = Modifier
                        .height(height = 14.dp)
                )
                GoToOrderRow()
                Spacer(
                    modifier = Modifier
                        .height(height = 24.dp)
                )
                RecentRestaurant(restaurantDataList = restaurantDataList)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(
        padding = PaddingValues()
    )
}