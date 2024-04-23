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
            modifier = Modifier
                .fillMaxSize()

        ) {
            Box(
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(top = 10.dp),
            ){
                Text(
                    text = "Ejercicio 2",
                    fontSize = 30.sp,
                    color = Color.Blue,
                    modifier = Modifier
                        .background(Color.Yellow)
                        .border(2.dp, Color.Black)
                        .align(Alignment.TopCenter)
                        .padding(10.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ){
                Box(
                    modifier = Modifier
                        .background(Color.Blue)
                        .weight(1f)
                        .height(100.dp)
                ){

                    Text(
                        text = "PMDM",
                        fontSize = 30.sp,
                        color = Color.White,
                        modifier = Modifier.align(Alignment.BottomCenter)
                    )
                }
                Box(
                    modifier = Modifier
                        .background(Color.Green)
                        .weight(1f)
                        .height(100.dp)
                ){

                    Text(
                        text = "DAM 2",
                        fontSize = 30.sp,
                        color = Color.Gray,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxWidth()
                    .height(200.dp)

            ){
                Text(
                    text = "...Combinando Column y Box",
                    fontSize = 22.sp,
                    color = Color.Yellow,
                    modifier = Modifier.align(Alignment.BottomEnd)
                )
            }
        }
    }
}