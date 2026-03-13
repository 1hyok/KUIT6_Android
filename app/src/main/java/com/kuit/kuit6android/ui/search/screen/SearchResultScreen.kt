package com.kuit.kuit6android.ui.search.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kuit.kuit6android.ui.search.component.SearchBar

@Composable
fun SearchResultScreen(
    modifier: Modifier = Modifier,
    padding: PaddingValues,
    searchKeyword: String
) {
    Column(
        modifier.padding(padding)
    ) {

        SearchBar(text = searchKeyword)
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchResulScreenPreview() {
    SearchResultScreen(
        padding = PaddingValues(),
        searchKeyword = "검색"
    )
}