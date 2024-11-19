package com.example.jetpack2.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack2.R
import com.example.jetpack2.ui.theme.onestFontFamily

@Preview(showBackground = true)
@Composable
fun Carousel(){

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF06094C), shape = RoundedCornerShape(10.dp))
                .wrapContentHeight()
                .padding(horizontal = 10.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ){
            Column(
                Modifier.weight(6f)
            ) {
                Text(
                    text = "Zenbook Trio",
                    fontFamily = onestFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    color = Color.Gray
                )

                Spacer(Modifier.height(6.dp))

                Text(
                    text = "Unbelievable Visual & Performance",
                    fontFamily = onestFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White
                )

                Spacer(Modifier.height(6.dp))


                Button(
                    onClick = {},
                    modifier = Modifier
                        .wrapContentHeight(),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF6200EE), // Background color
                        contentColor = Color.White          // Text color
                    )
                ) {
                    Text(
                        text = "Buy Now",
                        fontSize = 14.sp,
                        fontFamily = onestFontFamily,
                        fontWeight = FontWeight.Medium
                    )
                }
            }

            Column(
                Modifier.weight(4f)
            ) {
                Image(
                    painter = painterResource(R.drawable.zenbook),
                    contentDescription = "Zenbook Laptop Carousel",
                    modifier = Modifier
                        .size(145.dp)
                )
            }
        }

}