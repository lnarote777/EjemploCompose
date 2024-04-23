import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun Ejercicio3(){

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Surface(
                modifier = Modifier.size(65.dp, 100.dp),
                color = Color.Red
            ){
                Text(
                    text = "Ejemplo 1",
                    color = Color.Black,
                )
            }
            Surface(
                modifier = Modifier.size(65.dp, 300.dp),
                color = Color.Gray
            ){
                Text(
                    text = "Ejemplo 2",
                    color = Color.Black,
                )
            }
            Surface(
                modifier = Modifier.size(65.dp, 300.dp),
                color = Color.Cyan
            ){
                Text(
                    text = "Ejemplo 3",
                    color = Color.Black,
                )
            }
            Surface(
                modifier = Modifier.size(65.dp, 100.dp),
                color = Color.Green
            ){
                Text(
                    text = "Ejemplo 4",
                    color = Color.Black,
                )
            }
        }
    }


}