package com.kuit.kuit6android.ui.home.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.home.component.AddressRow
import com.kuit.kuit6android.ui.home.component.CategoryRow
import com.kuit.kuit6android.ui.home.component.GetCouponItem
import com.kuit.kuit6android.ui.home.component.GoToOrderRow
import com.kuit.kuit6android.ui.home.component.SearchTextField

@Composable
fun HomeScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                padding
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            GetCouponItem()
            Spacer(modifier = modifier.height(height = 20.dp))
            Column(
                modifier = modifier.padding(horizontal = 27.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AddressRow()
                SearchTextField(
                    modifier = modifier.padding(horizontal = 22.dp)
                )
                CategoryRow()
                Spacer(modifier = modifier.height(height = 14.dp))
                CategoryRow()
                Spacer(modifier = modifier.height(height = 14.dp))
                GoToOrderRow()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(
        padding = PaddingValues()
    )
}