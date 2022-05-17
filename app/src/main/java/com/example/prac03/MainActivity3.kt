package com.example.prac03

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prac03.ui.theme.Prac03Theme
import kotlin.system.exitProcess

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(20.dp)
            ) {
                Card(
                    elevation = 4.dp,
                    backgroundColor = Color.Magenta,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pp),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(20.dp)
                    )
                }
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()

            ) {

                Text(
                    text = "1. Application Development \n Practice(ADP262S)_Practical \n Year-round Module",
                    color = Color.Blue,
                    fontSize = 15.sp, fontWeight = FontWeight.Bold
                )
                Text(
                    text = "2. ICT Electives(ICE362S) \n Practical, Year-round Module",
                    color = Color.Blue,
                    fontSize = 15.sp, fontWeight = FontWeight.Bold
                )
                Text(
                    text = "3. Professional Practice(PFP362S) \n Theory, Semester Module",
                    color = Color.Blue,
                    fontSize = 15.sp, fontWeight = FontWeight.Bold
                )
                Text(
                    text = "4. Project Management(PRM372S) \n Theory, Year-round Modulue",
                    color = Color.Blue,
                    fontSize = 15.sp, fontWeight = FontWeight.Bold
                )
            }

            val nav = LocalContext.current
            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(20.dp)
            ) {
                Button(
                    onClick = {
                        nav.startActivity(Intent(nav, MainActivity2::class.java))
                    }) {
                    Text(text = "Back", fontSize = 20.sp, color = Color.Magenta)
                }

                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(20.dp)

                ) {
                    val openDialog = remember { mutableStateOf(false) }
                    val context = LocalContext.current


                    Button(
                        onClick = {
                            openDialog.value = true
                        }
                    )

                    {
                        Icon(
                            imageVector = Icons.Filled.Face,
                            contentDescription = "Localized description",
                            Modifier.padding(end = 8.dp),

                            )
                        Text(
                            text = "Good bye...",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Magenta
                        )
                    }

                    if (openDialog.value) {

                        AlertDialog(
                            onDismissRequest = {
                                openDialog.value = false
                            },
                            text = {
                                Text(
                                    "Leaving now?",
                                    fontSize = 20.sp,
                                    color = Color.Blue,
                                    fontWeight = FontWeight.Bold
                                )
                            },

                            confirmButton = {



                                Button(
                                    onClick = {
                                        finishAffinity()
                                        exitProcess(0)

                                        Toast.makeText(
                                            context,
                                            "Confirm...",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    })
                                {
                                    Text("Yes")
                                }
                            },

                            dismissButton = {
                                Button(
                                    onClick = {
                                        openDialog.value = false
                                        Toast.makeText(
                                            context,
                                            "Dismiss.....",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    })
                                {
                                    Text("No")
                                }

                            },
                            backgroundColor = Color.Magenta
                        )
                    }
                }
            }
        }
    }

}