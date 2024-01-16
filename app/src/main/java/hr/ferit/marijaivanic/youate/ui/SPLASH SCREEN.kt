package hr.ferit.marijaivanic.youate.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import hr.ferit.marijaivanic.youate.R
import hr.ferit.marijaivanic.youate.ui.theme.BrinkPink
import hr.ferit.marijaivanic.youate.ui.theme.InterBlack
import hr.ferit.marijaivanic.youate.ui.theme.InterRegular
import hr.ferit.marijaivanic.youate.ui.theme.LibreFranklinBlack
import hr.ferit.marijaivanic.youate.ui.theme.Rajah
import hr.ferit.marijaivanic.youate.ui.theme.Salmon
import hr.ferit.marijaivanic.youate.ui.theme.White


@Preview(showBackground = true)
@Composable
fun SplashScreen() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        BrinkPink,
                        Salmon,
                        Rajah
                    )
                )
            )
            .padding(top = 90.dp, bottom = 90.dp)
    ) {
        LOGO()
        Spacer(modifier = Modifier.padding(bottom = 90.dp))
        ScreenTitle(title1 = "YOU", title2 = "ATE")
        ScreenSubtitle(subtitle = "and left no crumbs")
        Spacer(modifier = Modifier.padding(bottom = 280.dp))
        WhiteButton()
    }
}

@Composable
fun LOGO() {
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "LOGO",
        modifier = Modifier
            .width(90.dp)
            .height(80.dp)
    )
}

@Composable
fun ScreenTitle(
    title1 : String,
    title2 : String
) {
    Row {
        Text(
            textAlign = TextAlign.Center,
            text = title1,
            style = TextStyle(
                color = White,
                fontSize = 60.sp,
                fontFamily = InterBlack
            )
        )
        Text(
            textAlign = TextAlign.Center,
            text = title2,
            style = TextStyle(
                color = White,
                fontSize = 60.sp,
                fontFamily = InterBlack
            )
        )
    }
}

@Composable
fun ScreenSubtitle(
    subtitle : String
) {
    Text(
        text = subtitle,
        textAlign = TextAlign.Center,
        style = TextStyle(
            color = White,
            fontSize = 30.sp,
            fontFamily = InterRegular
        )
    )
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun WhiteButton() {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(70.dp),
        colors = ButtonDefaults.buttonColors(containerColor = White),
        modifier = Modifier
            .shadow(elevation = 20.dp)
            .width(200.dp)
            .height(55.dp)
    ) {
        Text(
            text = "GET STARTED",
            fontFamily = LibreFranklinBlack,
            fontSize = 18.sp,
            style = TextStyle(
                brush = Brush.horizontalGradient(
                    colors = listOf(Rajah, Salmon, BrinkPink)
                )
            )
        )
    }
}