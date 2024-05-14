package net.ezra.ui.about

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun AboutScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Row {
            Text(
                text = "DASHBBOARD", fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Right,
                fontSize = 11.sp
            )
            Spacer(modifier = Modifier.width(270.dp))
            Icon(
                imageVector = Icons.Default.AccountCircle,
                modifier = Modifier.padding(10.dp),
                contentDescription = ""
            )
        }
        Row(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxSize())

        {
            Card(
                shape = RoundedCornerShape(43.dp),
                modifier = Modifier

                    .fillMaxSize()
            ) {

Row {


                Card(

                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(Color.Yellow),
                    modifier = Modifier
                        

                        .padding(20.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        modifier = Modifier.padding(10.dp),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(text = "786")
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(text = "Total unit IN ST ")


                }
Spacer(modifier = Modifier.width(40.dp))
                Card(
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(Color.Cyan),
                    modifier = Modifier

                        .padding(20.dp)
                ) {
                    Spacer(modifier = Modifier.width(20.dp))

                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        modifier = Modifier.padding(10.dp),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(text = "$ 565,430")
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(text = "Total inventory ")

                }}
                Spacer(modifier = Modifier.height(20.dp))



                Text(text = "Inventory", fontWeight = FontWeight.ExtraBold)
                Card (
                    shape = RoundedCornerShape(23.dp)
                ){
                    Text(text = "NO. of Tires")
                    Spacer(modifier = Modifier.width(4.dp))
                    485
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "View stock")
                    }
                }

            }

        }
        }
    }




@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())}


