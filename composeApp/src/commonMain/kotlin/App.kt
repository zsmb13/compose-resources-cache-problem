import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.*
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        var count by remember { mutableStateOf(0) }
        LaunchedEffect(Unit) {
            while( true) {
                delay(1000)
                count++
            }
        }
        
        Text(stringResource(Res.string.the_count_is, count))
    }
}