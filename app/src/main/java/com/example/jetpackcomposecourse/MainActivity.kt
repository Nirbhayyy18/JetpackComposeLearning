package com.example.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomposecourse.A_FundamentalConcepts.AccessResource
import com.example.jetpackcomposecourse.B_Parameters_in_Compose.demo
import com.example.jetpackcomposecourse.ui.theme.JetpackComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeCourseTheme {

//              Greet("Nirbhay")
                AccessResource()
                demo(name = "Nirbhay")
            }
        }
    }
}