package com.example.jetpackcomposecourse.C_Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*
    In Material Design, there are two types of progress indicator:

    Determinate: Displays exactly how much progress has been made.
    Indeterminate: Animates continually without regard to progress.

    Likewise, a progress indicator can take one of the two following forms:
    1. Linear - A horizontal bar that fills from left to right.
    2. Circular - A circle whose stroke grows in length until it encompasses the full circumference of the circle.

*/

// 1. Circular Progress Indicator

@Composable
fun CircularProgree()
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        var loading by remember { mutableStateOf(false) }

        Button(onClick = { loading = true }, enabled = !loading) {
            Text("Start loading")
        }

        if (!loading) return

        CircularProgressIndicator(
            modifier = Modifier.width(64.dp),
            color = MaterialTheme.colorScheme.secondary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant,
        )

        Spacer(Modifier.height(40.dp))

        // Linear Progress Indicator
        LinearProgressIndicator(
        progress = { 0.7f },
            color = ProgressIndicatorDefaults.linearColor,
        trackColor = ProgressIndicatorDefaults.linearTrackColor,
        strokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowProgress()
{
    CircularProgree()
}

