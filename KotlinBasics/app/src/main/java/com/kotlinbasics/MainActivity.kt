package com.kotlinbasics

import android.os.Bundle
import android.text.BoringLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasics.ui.theme.KotlinBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        week02Variables()
        week02Functionos()
    }
}

fun week02Variables(){
    /*println("Week02 Variables")
    val courseName = "Mobile Programing"
    //courseName = "IoT Programing"
    var week = 1
    week = 2

    println("Course: $courseName")
    println("Week: $week")*/

    println("== Kotlin Variables ==")

    val name = "Android"
    //val name: String = "Android" 타입 지정도 가능
    var version = 8.1
    println("Hello $name $version")

    val age: Int = 23
    val height: Double = 181.4
    val isStudent: Boolean = true

    println("AGE: $age,height: $height, isStudent: $isStudent ")

}

fun week02Functionos(){
    println("Week 02 Functions")

    fun greet(name: String) = "Hello, $name!"

    println(greet("Android Developer"))
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
    KotlinBasicsTheme {
        Greeting("Android")
    }
}