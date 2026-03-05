package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun GetCouponItem(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(color = Color(color = 0xFF212B35))
            .padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_twinkle),
            contentDescription = "twinkle"
        )

        Text(
            text = "무료배달 + 총 10,000원 할인",
            modifier = modifier.padding(start = 5.dp),
            color = Color(color = 0xFFFDFFFF),
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp
        )

        Text(
            text = "적용 가능",
            modifier = modifier.padding(start = 2.dp),
            color = Color(color = 0xFFFDFFFF),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun GetCouponItemPreview() {
    GetCouponItem()
}