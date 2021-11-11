package com.android.layoutdenganrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.layoutdenganrow.ui.theme.LayoutDenganRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun ItemScreen() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.Magenta)
                .weight(2f)
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = "0",
            onValueChange = {},
            modifier = Modifier
                .padding(6.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(6.dp)
                    .weight(1f)
            ) {
                Text(text = "Increase")
            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(6.dp)
                    .weight(1f)
            ) {
                Text(text = "Descrease")
            }
        }
    }
}

@Preview
@Composable
fun PreviewItemScreen() {
    ItemScreen()
}
