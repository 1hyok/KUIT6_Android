package com.kuit.kuit6android.ui.restaurant

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.restaurant.RestaurantData

@Composable
fun RestaurantItem(
    modifier: Modifier = Modifier,
    restaurantData: RestaurantData,
    isRecent: Boolean = true,
    onNavigateToRestaurantDetail: (RestaurantData) -> Unit
) {
    Column(
//        modifier = modifier.width(IntrinsicSize.Max)
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = { onNavigateToRestaurantDetail(restaurantData) })
    ) {
        Image(
            painter = painterResource(id = restaurantData.imageId),
            contentDescription = restaurantData.name,
            modifier = Modifier
                .fillMaxWidth()
//                .size(
//                    width = 230.dp,
//                    height = 129.dp
//                )
                .height(129.dp)
                .clip(shape = RoundedCornerShape(size = 8.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(height = 5.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = restaurantData.name,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = "${restaurantData.time}분",
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal
            )
        }
        Spacer(modifier = Modifier.height(height = 10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_star),
                contentDescription = "star",
                modifier = Modifier.size(
                    width = 20.dp,
                    height = 15.dp
                )
            )
            Spacer(
                modifier = Modifier.width(width = if (isRecent) 5.dp else 10.dp)
            )
            Text(
                text = "${restaurantData.ratingData.rating} (${restaurantData.ratingData.raters})",
                color = Color(color = 0xFC575252),
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
            )
        }
    }
}