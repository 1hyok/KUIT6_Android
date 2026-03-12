package com.kuit.kuit6android.ui.home.component.restaurant

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.restaurant.RecentRestaurantData
import com.kuit.kuit6android.ui.home.data.restaurant.RestaurantRatingData

@Composable
fun RecentRestaurantItem(
    modifier: Modifier = Modifier,
    restaurantData: RecentRestaurantData
) {

    Column(
        modifier = modifier.width(IntrinsicSize.Max)
    ) {
        Image(
            painter = painterResource(id = restaurantData.imageId),
            contentDescription = restaurantData.name,
            Modifier
                .size(
                    width = 230.dp,
                    height = 129.dp
                )
                .clip(shape = RoundedCornerShape(size = 8.dp))
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
        Row {
            Image(
                painter = painterResource(id = R.drawable.img_star),
                contentDescription = "star"
            )
            Spacer(
                modifier = Modifier.width(width = 5.dp)
            )
            Text(
                text = "${restaurantData.ratingData.rating} (${restaurantData.ratingData.raters})",
                color = Color(color = 0xFFFC575252),
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecentRestaurantItemPreview() {
    RecentRestaurantItem(
        restaurantData = RecentRestaurantData(
            imageId = R.drawable.img_mosu,
            name = "모수",
            time = 30,
            ratingData = RestaurantRatingData(4.5f, 100)
        )
    )
}