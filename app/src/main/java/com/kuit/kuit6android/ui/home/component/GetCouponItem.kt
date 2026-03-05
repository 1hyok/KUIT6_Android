package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kuit.kuit6android.R

@Composable
fun GetCouponItem(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_twinkle),
            contentDescription = "twinkle"
        )
        Text(
            "무료배달 + 총 10,000원 할인"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun GetCouponItemPreview() {
    GetCouponItem()
}