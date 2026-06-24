package com.example.hellocompose.switch_button

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun  MyContent(modifier: Modifier = Modifier){
    val mContext = LocalContext.current
    val mCheckState = remember { mutableStateOf(false) }
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Switch(
            checked = mCheckState.value,
//            onCheckChange = { mCheckState.value= it}
            onCheckedChange = { newValue -> mCheckState.value = newValue})
            Spacer(modifier = Modifier.height(100.dp))
            Button(onClick={
                Toast.makeText(mContext,mCheckState.value.toString(), Toast.LENGTH_SHORT).show()
            }){
                Text("Show Checked State", color= androidx.compose.ui.graphics.Color.White)
            }



    }
}