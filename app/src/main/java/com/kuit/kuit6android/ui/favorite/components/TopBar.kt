package com.kuit.kuit6android.ui.favorite.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun TopBar(
    modifier: Modifier = Modifier,
    onNavigateToBack: () -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_favorite_back),
            contentDescription = "favorite back",
            modifier = Modifier
                .size(24.dp)
                .clickable(
                    onClick = onNavigateToBack
                )
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_favorite),
            contentDescription = "favorite back",
            modifier = Modifier
                .size(24.dp)
                .clickable(
                    onClick = onNavigateToBack
                ),
            tint = Color(0xFF939DA9)
        )
    }
}

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: String,
    onNavigateToBack: () -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_favorite_back),
            contentDescription = "favorite back",
            modifier = Modifier
                .size(24.dp)
                .clickable(
                    onClick = onNavigateToBack
                )
        )
        Spacer(Modifier.width(27.dp))
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(Modifier.weight(1f))
        Text(
            text = "수정",
            color = Color(0xFF02AFFE),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal
        )
    }
}