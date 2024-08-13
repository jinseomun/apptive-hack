package com.example.hanzanhae.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hanzanhae.R
@Composable
fun AlcholDescription(){
    Column {

    Box(
       modifier = Modifier
           .fillMaxSize()
           .background(Color.White)
    ){
       Image(
          painter = painterResource(id = R.drawable.alcholdescription),
          contentDescription = "술 설명 이미지",
           modifier = Modifier
               .padding(top = 45.dp)
               .width(388.dp)
               .height(429.dp)
               .align(Alignment.TopCenter)

       )
        Text(
            text = "월탁",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight(700)
            ),
            modifier = Modifier
                .padding(top=500.dp,start=31.dp)
        )
        Text(
            text = "500ml",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF929292)
            ),
            modifier = Modifier
                .padding(top=520.dp,start=88.dp)
        )
        Text(
            text = "|",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400)
            ),
            modifier = Modifier
                .padding(top=520.dp,start=120.dp))
        Text(
            text = "13.1%",
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF929292)
            ),
            modifier = Modifier
                .padding(top=520.dp,start=126.dp)
        )
        Text(
            text = "전북 정읍",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFFE67171)
            ),
            modifier = Modifier
                .padding(top=512.dp,start=300.dp)
        )
        Text(
            text = "정읍 월탁은 전라북도 정읍시에 위치한 한국술도가에서 만든\n전통주입니다. " +
                    "월탁은 정제수, 쌀, 누룩 등을 원료로 하여 만\n들어지며, 탁주의 일종입니다. " +
                    "알코올 도수는 약 13.5%이며,\n용량은 500ml입니다.",
            style = TextStyle(
                fontSize = 13.7.sp,
                fontWeight = FontWeight(550)
            ),
            modifier = Modifier
                .padding(top = 550.dp, start = 31.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 163.dp)
                .width(330.dp)
                .height(37.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor =  Color(0xFFDC5555),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp),
            content = {
                Text(
                    text="한잔해 구독하기",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(700)
                    ))
            }
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 117.dp)
                .border(1.dp, Color(0xFFE67171), shape = RoundedCornerShape(12.dp))
                .width(330.dp)
                .height(37.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor =  Color.White,
            ),
            shape = RoundedCornerShape(12.dp),
            content = {
                Text(
                    text="술과 관련된 피드보기",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFE67171)
                    ))
            }
        )
        Text(
            text = "향미 그래프",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(850),
                color = Color(0xFFE67171)
            ),
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(bottom = 60.dp, start = 31.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.graph),
            contentDescription = "향미 그래프",
            modifier = Modifier

                .width(296.dp)
                .height(125.dp)
                .align(Alignment.BottomCenter)

        )



    }}
}



@Preview(showBackground = true)
@Composable
private fun AlcholDescriptionPreview() {
   AlcholDescription()
}
