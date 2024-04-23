import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun Ejercicio5(){
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Ejemplo 1",
                    color = Color.Black
                )
            }
            mySpacer(30)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Ejemplo 2",
                    color = Color.Black,
                )
            }
            mySpacer(50)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Ejemplo 3",
                    color = Color.Black,
                )
            }
            mySpacer(10)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.Magenta),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Ejemplo 4",
                    color = Color.Black,
                )
            }
        }
    }
}