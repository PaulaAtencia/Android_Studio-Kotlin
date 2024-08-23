package com.example.presentation_onthejob

import android.app.Presentation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.presentation_onthejob.ui.theme.Presentation_OntheJobTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Presentation_OntheJobTheme {
                Presentation()

            }
        }
    }
}

@Composable
fun Presentation() {
    Box(
        modifier = Modifier,
        contentAlignment = Alignment.Center,


    ){
        Title()
    }
}

@Composable
private fun Title(){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(painter = painterResource( R.drawable.android_logo),
            contentDescription = "Logo de Android",
            contentScale = ContentScale.FillWidth
        )

        Text(
            text = "Paula Atencia Barranco",
            fontSize= 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF8C0FA2),
        )

        Text(
            text = "Técnica de Aplicaciones Multiplataforma"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Presentation_OntheJobTheme {
        Presentation()

    }
}