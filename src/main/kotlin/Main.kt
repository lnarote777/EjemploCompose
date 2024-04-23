
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(800.dp, 700.dp))

    Window(
        onCloseRequest = ::exitApplication,
        state = windowState,
        title = "My Login") {
        //Ejercicio1()
       // Ejercicio2()
       // Ejercicio3()
        //Ejercicio4()
       // Ejercicio5()
        Ejercicio6()
    }
}
