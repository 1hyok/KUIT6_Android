package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R

@Composable
fun AddressRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_marker),
            contentDescription = "marker"
        )

        Spacer(modifier = Modifier.width(width = 12.dp))

        Text(
            text = "서울시 광진구 구의동",

            )
        Spacer(modifier = Modifier.width(width = 9.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_dropdown_arrow),
            contentDescription = "dropdown_arrow"
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            painter = painterResource(id = R.drawable.ic_bell),
            contentDescription = "bell"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AddressRowPreview() {
    AddressRow()
}