package com.example.hellocompose.Buttons

import android.R
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Testbtn(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,


    ) {
        val con = LocalContext.current
        Button(onClick = {
            Toast.makeText(con,"Testing Module hai bhai", Toast.LENGTH_LONG).show()


        },
            modifier = Modifier.padding(16.dp),
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Magenta,
                containerColor = Color.Cyan
            ),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
            border = BorderStroke(width = 2.dp, brush = SolidColor(Color.Green)),
            contentPadding = PaddingValues(
                start = 30.dp,
                end = 30.dp,
                top = 16.dp
                , bottom = 16.dp
            ),
            interactionSource = remember{
                MutableInteractionSource()
            }

            ) {
            Text("Button Module hai bhai",
                    fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Serif)
        }
    }
}