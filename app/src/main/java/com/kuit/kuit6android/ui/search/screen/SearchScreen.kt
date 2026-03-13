package com.kuit.kuit6android.ui.search.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.ui.search.component.SearchBar

@Composable
fun SearchScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    onNavigateToResult: (String) -> Unit,
    onNavigateToBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(
                padding
            )
            .padding(
                start = 20.dp,
                top = 20.dp,
                end = 20.dp
            )
    ) {
        SearchBar(
            text = "검색어를 입력해 주세요",
            onNavigateToBack = onNavigateToBack
        )
        Spacer(modifier = Modifier.height(35.dp))
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    "인기 검색어",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "오후 5:59 업데이트",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light
                )
            }
            Spacer(modifier.height(20.dp))
            val searchList = listOf("떡", "쌀", "밀", "과일", "채소", "고기", "젤리", "초콜릿", "계란", "소")
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                searchList.forEachIndexed { index, string ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable(
                                onClick = { onNavigateToResult(string) }
                            ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "${index + 1}",
                            color = if (index + 1 <= 3) Color(0xFF2A6DFF) else Color.Black,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            string,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
        }
    }
}