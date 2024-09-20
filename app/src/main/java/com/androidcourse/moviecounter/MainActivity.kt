import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RestTimesScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                            .background(Color(0xFFFFF9C4)) // Fondo amarillo claro oscuro
                    )
                }
            }
        }
    }
}

@Composable
fun RestTimesScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Tiempos de descanso", modifier = Modifier.padding(16.dp))
            Spacer(modifier = Modifier.height(16.dp))

            val imagen = painterResource(id = R.drawable.ejercicio)
            Image(
                painter = imagen,
                contentDescription = "Imagen de descanso",
                modifier = Modifier.size(150.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
            }) {
                Text("Añadir tiempo")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestTimesPreview() {
    MaterialTheme {
        RestTimesScreen()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MaterialTheme {
        Greeting(name = "World")
    }
}
