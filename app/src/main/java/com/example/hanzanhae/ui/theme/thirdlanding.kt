package com.example.hanzanhae.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.hanzanhae.R

@Composable
fun ThirdLand(){
    Box( modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFE67171))){
    Image(
        painter = painterResource(id = R.drawable.thirdland),
        contentDescription = "세번째 랜딩 이미지",
        modifier = Modifier
            .fillMaxSize()
    )}
}


@Preview(showBackground = true)
@Composable
private fun ThirdLandPreview() {
    ThirdLand()
}