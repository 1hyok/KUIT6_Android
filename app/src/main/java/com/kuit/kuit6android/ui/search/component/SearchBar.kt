package com.kuit.kuit6android.ui.search.component

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun SearchBar(
    modifier: Modifier = Modifier,
    text: String = "",
    onNavigateToBack: () -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_search_back),
            contentDescription = "back",
            modifier = Modifier.size(24.dp)
                .clickable(
                    onClick = onNavigateToBack
                )
        )
        Row(
            modifier = Modifier
                .weight(1f)
                .border(
                    width = 1.dp,
                    color = Color(0xFFEAEAEA),
                    shape = RoundedCornerShape(
                        size = 100.dp
                    )
                )
                .padding(
                    start = 20.dp,
                    top = 12.dp,
                    bottom = 12.dp
                ),
        ) {
            Text(
                text,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "search",
            modifier = Modifier.size(24.dp)
        )
    }
}