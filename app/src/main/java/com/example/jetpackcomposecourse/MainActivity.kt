package com.example.jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecourse.A_FundamentalConcepts.AccessResource
import com.example.jetpackcomposecourse.B_Parameters_in_Compose.demo
import com.example.jetpackcomposecourse.E_Layouts.MyTopAppBar
import com.example.jetpackcomposecourse.ui.theme.JetpackComposeCourseTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeCourseTheme {

//              Greet("Nirbhay")
//                AccessResource()
//                demo(name = "Nirbhay")
                MyTopAppBar()
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, device = Devices.NEXUS_10)
@Composable
fun showAppBarss()
{
    MyTopAppBar()
}