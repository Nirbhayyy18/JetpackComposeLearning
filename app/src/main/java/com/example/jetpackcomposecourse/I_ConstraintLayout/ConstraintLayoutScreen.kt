package com.example.jetpackcomposecourse.I_ConstraintLayout

import android.R.attr.start
import android.R.attr.top
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.Illuminant.A
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.jetpackcomposecourse.C_Components.text
import com.example.jetpackcomposecourse.H_Bottom_Navigation.Screen.AppNavv
import kotlinx.coroutines.NonDisposableHandle.parent

@Composable
fun ConstraintLayoutScreen()
{
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        // Create References
        val(A,B,C) = createRefs();
    }

    Button(onClick = {},
        modifier = Modifier.size(20.dp)

    )
    {
        text("Button1")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowNav()
{
    ConstraintLayoutScreen();
}