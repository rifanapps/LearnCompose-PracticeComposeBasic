package com.example.practicecomposebasic.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ComposeQuadrantScreen() {
    Surface(
        modifier = Modifier
            .padding(
                WindowInsets.statusBars.asPaddingValues(),
            )
            .fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            val modifier = Modifier.weight(1f)
            Row(
                modifier = Modifier
                    .weight(1f)

            ) {
                QuadrantText(
                    title = "Text composable",
                    desc = "Displays text and follows the recommended Material Design guidelines.",
                    color = Color(0xFFEADDFF),
                    modifier = modifier
                )
                QuadrantText(
                    title = "Image composable",
                    desc = "Creates a composable that lays out and draws a given Painter class object.",
                    color = Color(0xFFD0BCFF),
                    modifier = modifier
                )
            }
            Row(
                modifier = Modifier
                    .weight(1f)

            ) {
                QuadrantText(
                    title = "Row composable",
                    desc = "A layout composable that places its children in a horizontal sequence.",
                    color = Color(0xFFB69DF8),
                    modifier = modifier
                )
                QuadrantText(
                    title = "Column composable",
                    desc = "A layout composable that places its children in a vertical sequence.",
                    color = Color(0xFFF6EDFF),
                    modifier = modifier
                )
            }
        }
    }
}

@Composable
fun QuadrantText(title: String, desc: String, color: Color, modifier: Modifier) {
    Surface(
        modifier = modifier,
        color = color
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = desc,
                textAlign = TextAlign.Justify,
            )
        }
    }
}