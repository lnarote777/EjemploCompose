import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun Ejercicio6(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier.background(Color.Cyan),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Ejercicio 6",
                    fontSize = 30.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .background(Color.Yellow)
                        .border(2.dp, Color.Black)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Box(
                    modifier = Modifier
                        .background(Color.Blue)
                        .size(300.dp)
                ){}
                Box(
                    modifier = Modifier
                        .background(Color.Green)
                        .size(300.dp)
                ){}
            }
            Box(
                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxSize()
            ){}
        }
    }
}