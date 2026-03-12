package com.kuit.kuit6android.ui.home.component.Category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
//    ) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
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