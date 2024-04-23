import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun Ejercicio1() {
//    Surface(
//        color = Color.LightGray,
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Box(
//            modifier = Modifier.wrapContentSize()
//        ){
//            Surface(
//                color = Color.Cyan,
//                modifier = Modifier.size(20.dp)
//            ){}
//        }
//    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .background(Color.Cyan)
                .size(60.dp)
        )
    }
}