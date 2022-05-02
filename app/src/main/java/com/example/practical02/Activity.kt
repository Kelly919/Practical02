package com.example.practical02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practical02.ui.theme.Practical02Theme

class Activity : ComponentActivity() {
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

                ){

                    Image(painter = painterResource(id = R.drawable.pp),
                        contentDescription = null,
                        modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(20.dp)
                    )

                    Column(

                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxSize()
                            .height(170.dp)
                            .padding(8.dp)
                            .padding(8.dp)
                    ) {

                        Text(
                            text = "Mickley Khoza", color = Color.Blue,
                            fontSize = 25.sp, fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Diploma in ICT", color = Color.Blue,
                            fontSize = 25.sp, fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Informatics And Design", color = Color.Blue,
                            fontSize = 25.sp, fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "219457670", color = Color.Blue,
                            fontSize = 25.sp, fontWeight = FontWeight.Bold
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
                                nav.startActivity(Intent(nav, MainActivity::class.java))
                            }) {
                            Text(text = "Back", fontSize = 20.sp)
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(20.dp)

                        ) {
                            Button(
                                onClick = {
                                    Toast.makeText(
                                        applicationContext, "Application Development Practice\r\n" +
                                                "ICT Electives\r\n" +
                                                "Professional Practice\r\n" +
                                                "Project Management", Toast.LENGTH_LONG
                                    ).show()
                                }) {
                                Text(text = "Current Modules", fontSize = 20.sp)
                            }
                        }

                    }

                }
            }
        }
    }
}


