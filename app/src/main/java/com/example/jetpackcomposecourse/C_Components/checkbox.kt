package com.example.jetpackcomposecourse.C_Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// CheckBox
// - Checkboxes let users select one or more items from a list.
@Composable
fun CheckboxMinimalExample() {
    var checked by remember { mutableStateOf(true) }

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row {
            Text(
                "Minimal checkbox"
            )
            Checkbox(
                checked = checked,
                onCheckedChange = { checked = it } // it = new checkbox state (true or false)
            )
        }
    Text(
        if (checked) "Checkbox is checked" else "Checkbox is unchecked"
    )
}
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun checkboxShow()
{
    CheckboxMinimalExample()
}