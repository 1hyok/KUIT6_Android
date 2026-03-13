package com.kuit.kuit6android.ui.search.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit6android.ui.search.component.SearchBar

@Composable
fun SearchResultScreen(
    modifier: Modifier = Modifier,
    padding: PaddingValues,
    searchKeyword: String,
    onNavigateToBack: () -> Unit
) {
    Column(
        modifier.padding(padding)
    ) {
        SearchBar(
            text = searchKeyword,
            onNavigateToBack = onNavigateToBack
        )
    }
}