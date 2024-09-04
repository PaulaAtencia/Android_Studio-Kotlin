package com.example.saturn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.saturn.ui.theme.SaturnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SaturnTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Saturn",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    var



    Column(

    )
    Text(
        text = "Saturn eats his child!",
        modifier = modifier
    )
    Image(
        painter = painterResource(id = R.drawable.francisco_de_goya__saturno_devorando_a_su_hijo__1819_1823_),
        contentDescription = "PrimeraImagen",

    )

    Button(
        onClick = 

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SaturnTheme {
        Greeting("Saturn")
    }
}