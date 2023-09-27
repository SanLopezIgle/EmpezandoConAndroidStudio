package com.dam.primera

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dam.primera.ui.theme.PrimeraTheme

class MainActivity : ComponentActivity() {

    val TAG : String = "estado"
    var name : String = "Android"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Greeting(name)
                }
            }
        }
        Log.d(TAG, "estoy en onCreate")

        //calcular(1,2)
        calcular(a=1, b=2)
        calcular(b=1, a=2)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "estoy en onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "estoy en onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "estoy en onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "estoy en onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "estoy en onDestroy")
    }

    //La funcion calcular la llamo dentro del onCreate
    fun calcular(a:Int, b:Int){
        val operacion = a+b
        Log.d("calcular", operacion.toString())
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Saludo(name: String, modifier: Modifier = Modifier){
    Text(
        text = "Hola $name!",
        fontSize = 100.sp,
        color = Color.Blue,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimeraTheme {
        Greeting("Android")
    }
}