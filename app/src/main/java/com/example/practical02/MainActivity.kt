package com.example.practical02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practical02.ui.theme.Practical02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Welcome to My Jetpack Compose Journey!!!",
                    color = Color.Blue, fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,

                )
            }

            Column (

                    ){
                val openDialog = remember { mutableStateOf(false) }
                val context = LocalContext.current

                Button(
                    onClick = {
                        openDialog.value = true
                    }
                )

                {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = "Localized description",
                        Modifier.padding(end = 8.dp),

                        )
                    Text(text = "Info", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }

                if (openDialog.value) {

                    AlertDialog(
                        onDismissRequest = {
                            openDialog.value = false
                        },
                        text = {
                            Text(
                                "My journey in Mobile Programming has been good." +
                                        " I have learned many things, " +
                                        "I cannot wait to create my own apps in future :) ....",
                                fontSize = 10.sp,
                                color = Color.Black
                            )
                        },
                        confirmButton = {
                            Button(
                                onClick = {
                                    openDialog.value = false
                                    Toast.makeText(context, "Confirm...", Toast.LENGTH_SHORT).show()
                                })
                            {
                                Text("Confirm")
                            }
                        },

                        dismissButton = {
                            Button(
                                onClick = {
                                    openDialog.value = false
                                    Toast.makeText(context, "Dismiss.....", Toast.LENGTH_SHORT)
                                        .show()
                                })
                            {
                                Text("Dismiss")
                            }
                        },
                        backgroundColor = Color.Magenta
                    )
                }


                val navigation = LocalContext.current
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(20.dp)

                ) {
                    Button(
                        onClick = {
                         navigation.startActivity(Intent(navigation, Activity::class.java))
                        })
                    {
                        Text("Start Journey", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    }

                }
            }
        }
    }
}




















    


