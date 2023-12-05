package com.example.appfirebase

import android.text.Layout.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    var name by rememberSaveable {mutableStateOf("")}
    var email by rememberSaveable {mutableStateOf("")}
    var phone by rememberSaveable {mutableStateOf("")}
           Text(text = "Agregar usuarios Firebase")
        Spacer(modifier =Modifier.height(15.dp) )
        TextField(value = name, onValueChange = {name=it},
            label={ Text(text = "Inserta tu nombre")},
            placeholder = {Text(text="Juan Torres Torres")},
            singleLine = true,
            )
        Spacer(modifier =Modifier.height(15.dp) )
        TextField(value = email, onValueChange = {email=it},
            label={ Text(text = "Inserta tu email")},
            placeholder = {Text(text="Juan2T@gmail.com")},
            singleLine = true,
        )
        Spacer(modifier =Modifier.height(15.dp) )
        TextField(value = phone, onValueChange = {phone=it},
            label={ Text(text = "Número Celular")},

            singleLine = true,
        )
        Spacer(modifier =Modifier.height(15.dp) )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Enviar")
        }

}
@Preview(showSystemUi = true)
@Composable
fun PreviewScreen(){
    HomeScreen()
}




