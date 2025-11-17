package com.example.jetpackcomposecourse.Z_Sample_Designs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.input.keyboardOptions
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SimpleRegisterScreen() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            var email by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            var confirmpassword by remember { mutableStateOf("") }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Register", style = MaterialTheme.typography.headlineSmall)
                Spacer(Modifier.height(24.dp))

                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Email
                    )
                )

                Spacer(Modifier.height(12.dp))

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    )
                )

                Spacer(Modifier.height(12.dp))

                OutlinedTextField(
                    value = confirmpassword,
                    onValueChange = { confirmpassword = it },
                    label = { Text("Confirm Password") },
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    )
                )

                Spacer(Modifier.height(20.dp))

                Button(
                    onClick = { /* TODO: handle login */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                ) {
                    Text("Sign Up")
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewSimpleRegister() {
    SimpleRegisterScreen()
}
