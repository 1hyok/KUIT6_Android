package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.CategoryData

@Composable
fun CategoryRow(modifier: Modifier = Modifier) {
    val categoryList = listOf(
        CategoryData(
            imageId = R.drawable.img_pork_cutlet,
            category = "돈까스"
        ),
        CategoryData(
            imageId = R.drawable.img_japanese_food,
            category = "일식"
        ),
        CategoryData(
            imageId = R.drawable.img_korean_food,
            category = "한식"
        ),
        CategoryData(
            imageId = R.drawable.img_chicken,
            category = "치킨"
        ),
        CategoryData(
            imageId = R.drawable.img_snack_food,
            category = "분식"
        ),
    )
//    Row(
//        modifier = modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.Center
//    ) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        categoryList.forEach {
            CategoryItem(
                categoryData = it
            )
        }
    }
//    }
}

@Preview(showBackground = true)
@Composable
private fun CategoryRowPreview() {
    CategoryRow()
}