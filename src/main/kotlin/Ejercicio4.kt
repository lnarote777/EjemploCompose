import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
fun Ejercicio4(){
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()

    ) {
        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier.fillMaxSize()
        ) {
            Surface(
                border = BorderStroke(1.dp, Color.Red),
                modifier = Modifier
                    .size(95.dp, 300.dp)
                    .padding(10.dp, 0.dp),
            ) {
                Text(
                    text = "Ejemplo 1",
                    modifier = Modifier.padding(5.dp)
                )
            }
            Surface(
                border = BorderStroke(1.dp, Color.Blue),
                modifier = Modifier
                    .size(95.dp, 200.dp)
                    .padding(10.dp, 0.dp)
            ) {
                Text(
                    text = "Ejemplo 2",
                    modifier = Modifier.padding(5.dp)
                )
            }
            Surface(
                border = BorderStroke(1.dp, Color.Red),
                modifier = Modifier
                    .size(95.dp, 100.dp)
                    .padding(10.dp, 0.dp)
            ) {
                Text(
                    text = "Ejemplo 3",
                    modifier = Modifier.padding(5.dp)
                )
            }
            Surface(
                border = BorderStroke(1.dp, Color.Blue),
                modifier = Modifier
                    .size(95.dp, 25.dp)
                    .padding(10.dp, 0.dp)
            ) {
                Text(
                    text = "Ejemplo 4",
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}
