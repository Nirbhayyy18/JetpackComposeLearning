package com.example.jetpackcomposecourse.C_Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.RadioButton
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

// Radio Button
// - Users can only one options from group of options

@Composable
fun RadioButtonExample()
{
    var selectedOption by remember {mutableStateOf("Option 1")}
    Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        RadioButton(
            selected = selectedOption == "Option 1", // meaning - radio button is selected or not
            onClick = {selectedOption = "Option 1"}
        )
        RadioButton(
            selected = selectedOption == "Option 2",
            onClick = {selectedOption = "Option 2"}
        )
        RadioButton(
            selected = selectedOption == "Option 3",
            onClick = {selectedOption = "Option 3"}
        )
        Spacer(Modifier.height(20.dp))
    }
}

// Display Text Beside Radio Button
@Composable
fun TextwithRadioButton()
{
    var selectedOption by remember{mutableStateOf("Option 1")}
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(verticalAlignment = Alignment.CenterVertically){

            RadioButton(
                selected = selectedOption == "Option 1",
                onClick = {selectedOption = "Option 1"}
            )
            Text(
                text = "Option 1",
            )}
        Row(verticalAlignment = Alignment.CenterVertically){
            RadioButton(
                selected = selectedOption == "Option 2",
                onClick = {selectedOption = "Option 2"}
            )
            Text(
                text = "Option 2",
            )}
        Row(verticalAlignment = Alignment.CenterVertically){
            RadioButton(
                selected = selectedOption == "Option 3",
                onClick = {selectedOption = "Option 3"}
            )
            Text(
                text = "Option 3",
            )}
        }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showRadioButton()
{
    //RadioButtonExample()
    TextwithRadioButton()
}