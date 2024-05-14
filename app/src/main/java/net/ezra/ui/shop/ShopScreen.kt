package net.ezra.ui.shop



import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_Shop

@Composable
fun ShopScreen(navController: NavHostController) {

    Column()

    {

       Text(text = "Shop Screen")
        Text(
            modifier = Modifier
                .border(width = 2.dp, color = Color.Transparent, shape = RoundedCornerShape(8.dp))


                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_Shop) { inclusive = true }
                    }

                },
            text = "Home",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
        Text(text = stringResource(id = R.string.home))



    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ShopScreen(rememberNavController())
}

