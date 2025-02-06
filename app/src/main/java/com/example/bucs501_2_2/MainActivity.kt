package com.example.bucs501_2_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.example.bucs501_2_2.ui.theme.BUCS501_2_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            BUCS501_2_2Theme {
                var screenSize : MutableState<IntSize> = remember { mutableStateOf(IntSize(0,0))}
                Scaffold(
                    modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box (modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                        .background(Color(192, 192, 192))
                        .onGloballyPositioned { coordinates ->
                            screenSize.value = coordinates.size
                        }
                    ){
                        Gallary(
                            modifier = Modifier.padding(innerPadding),screenSize = screenSize.value
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Gallary(modifier: Modifier = Modifier, screenSize: IntSize) {
    val thirdHeight = (screenSize.height/ LocalDensity.current.density)/3
    val thirdWidth = (screenSize.width/ LocalDensity.current.density)/2
    Column(modifier = modifier
        .fillMaxSize()
        .background(Color(255, 100, 0)),
        verticalArrangement = Arrangement.Top
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(thirdHeight.dp)
                .background(Color(150,100,100)),
        ){
            Column ()
            { Image(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                painter = painterResource(id = R.drawable.stickman),
                contentDescription = "StickMan",
                contentScale = ContentScale.Crop
            )
            Text(text = "Stick 1")}
            Spacer(modifier = Modifier.width(10.dp))
            Column (){
                Image(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    painter = painterResource(id = R.drawable.stickman),
                    contentDescription = "StickMan",
                    contentScale = ContentScale.Crop
                )
                Text(text = "Stick 1")
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column() {
                Image(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    painter = painterResource(id = R.drawable.stickman),
                    contentDescription = "StickMan",
                    contentScale = ContentScale.Crop
                )
                Text(text = "Stick 1")
            }


        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(thirdHeight.dp)
                .background(Color(150,100,100))

        ){
            Column ()
            { Image(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                painter = painterResource(id = R.drawable.stickman),
                contentDescription = "StickMan",
                contentScale = ContentScale.Crop
            )
                Text(text = "Stick 4")}
            Spacer(modifier = Modifier.width(10.dp))

            Column (){
                Image(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    painter = painterResource(id = R.drawable.stickman),
                    contentDescription = "StickMan",
                    contentScale = ContentScale.Crop
                )
                Text(text = "Stick 5")
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column() {
                Image(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    painter = painterResource(id = R.drawable.stickman),
                    contentDescription = "StickMan",
                    contentScale = ContentScale.Crop
                )
                Text(text = "Stick 6")
            }


        }

    }

}

