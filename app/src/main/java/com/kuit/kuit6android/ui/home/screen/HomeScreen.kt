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
import com.kuit.kuit6android.ui.home.components.AddressRow
import com.kuit.kuit6android.ui.home.components.Category.CategoryRow
import com.kuit.kuit6android.ui.home.components.GetCouponItem
import com.kuit.kuit6android.ui.home.components.GoToOrderRow
import com.kuit.kuit6android.ui.home.components.SearchTextField
import com.kuit.kuit6android.ui.restaurant.RecentRestaurant
import com.kuit.kuit6android.ui.restaurant.RestaurantSamples

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    padding: PaddingValues
) {
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
                RecentRestaurant(restaurantDataList = RestaurantSamples.restaurantDataList)
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