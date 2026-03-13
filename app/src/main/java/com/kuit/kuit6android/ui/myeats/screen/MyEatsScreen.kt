package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun MyEatsScreen(
    modifier: Modifier = Modifier,
    padding: PaddingValues,
    onNavigateToFavorite: () -> Unit
) {
    Column(
        modifier = modifier
            .padding(padding)
            .padding(
                top = 18.dp,
                start = 27.dp,
                end = 27.dp
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "정일혁",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(12.dp))
        Text(
            "010-2392-2074",
            color = Color(0xFF444D53),
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
        )
        Spacer(Modifier.height(18.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 23.dp)
        ) {
            MyEatsTab(
                modifier = Modifier.weight(1f),
                num = 0, title = "내가 남긴 리뷰"
            )
            MyEatsTab(
                modifier = Modifier.weight(1f),
                num = 0, title = "도움이 됐어요"
            )
            MyEatsTab(
                modifier = Modifier.weight(1f),
                num = 0, title = "즐겨찾기"
            )
        }
        Spacer(Modifier.height(21.dp))
        Button(
            onClick = {},
            shape = RoundedCornerShape(size = 4.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color(0xFF02AFFE),
            ),
            border = BorderStroke(
                width = 0.5.dp,
                color = Color(0xFF02AFFE),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
                .height(48.dp),
        ) {
            Text(
                "자세히 보기",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 14.sp
            )
        }
        Spacer(Modifier.height(22.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(
                    onClick = onNavigateToFavorite
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_favorite),
                contentDescription = "favorite",
                modifier = Modifier.size(30.dp)
            )
            Spacer(Modifier.width(19.dp))
            Text(
                text = "즐겨찾기",
                fontSize = 21.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Composable
private fun MyEatsTab(
    modifier: Modifier = Modifier,
    num: Int, title: String
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "$num",
            fontSize = 28.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(Modifier.height(14.dp))
        Text(
            title,
            color = Color(0xFF444D53),
            fontSize = 11.sp,
            fontWeight = FontWeight.Normal,
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//private fun MyEatsScreenPreview() {
//    MyEatsScreen(
//        padding = PaddingValues()
//    )
//}