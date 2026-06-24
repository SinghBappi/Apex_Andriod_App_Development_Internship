package com.example.hellocompose.EditText


import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//private val icons: Any

@Composable
fun MyTextField(){
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = {text = it},
            label = {Text("Enter Text Please Sir/Mam:")}
            ,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text="You Entered This: $text")

    }
}


@Composable
fun MeraTextField(){
    var abc by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.
        CenterHorizontally,

    ) {
        TextField(value = abc
        ,
            onValueChange = {abc = it},
            label = {Text("Enter a Custome Text:")}
            ,
            modifier = Modifier.fillMaxWidth()
            )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Tu ne yeh Type kiya:$abc")
    }
}


@Composable
fun MyTextFieldUI(){
    var inputval  = remember { mutableStateOf(TextFieldValue()) }
    Column(
        modifier = Modifier.fillMaxHeight().fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = inputval.value,
            onValueChange = {inputval.value=it}
            , modifier = Modifier.padding(all = 17.dp).fillMaxWidth()

            ,
            enabled = true,
            readOnly = false,
           textStyle = TextStyle(
               color = Color.Cyan,
               fontSize = 15.sp,
               fontWeight = FontWeight.Bold,
               fontStyle = FontStyle.Normal,
               letterSpacing = 0.5.sp,
               fontFamily = FontFamily.Cursive,
               textDecoration = TextDecoration.None,
               textAlign = TextAlign.Start
           ),
            label = {Text("Label hai Bhai Dekh mat !")}
            ,
            placeholder = {Text("Enter Your Name:")}
                ,
            leadingIcon = {
                // our leading icon and its color.
//                Icon(Icons.Filled.AccountCircle, contentDescription = null, tint = Color(0xFF6200EE))
            }

            )
    }
}