package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantComposeTheme {
                QuadrantCompose()

            }
        }
    }
}

@Composable
fun QuadrantCompose() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Quadrant(
                title = "Text composable",
                body = "Displays text and follows the recommended Material Design guidelines.",
                colors = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)

            )
            Quadrant(
                title = "Image composable",
                body = "Creates a composable that lays out and draws a given Painter class object.",
                colors = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)

            )
        }

        Row (
            modifier = Modifier.weight(1f)
        ){
            Quadrant(
                title = "Row composable",
                body = "A layout composable that places its children in a horizontal sequence.",
                colors = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)

            )
            Quadrant(
                title = "Column composable",
                body = "A layout composable that places its children in a vertical sequence.",
                colors = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}


@Composable
private fun Quadrant(title : String, body: String, colors : Color, modifier: Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(color = colors).fillMaxSize().padding(16.dp)
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom =16.dp),
        )

        Text(
            text = body,
            textAlign = TextAlign.Justify,

        )
    }

}


@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantComposeTheme {
        QuadrantCompose()

    }
}