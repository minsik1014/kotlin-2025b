package com.kotlinbasics

import android.os.Bundle
import android.text.BoringLayout
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberUpdatedState
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
        //week02Variables()
        //week02Functionos()
        week03Classes()
        week03Collections()

    }
}

private fun week02Variables(){
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

private fun week02Functionos(){
    println("Week 02 Functions")
/*
    fun greet(name: String) = "Hello, $name!"

    println(greet("Android Developer"))

    */
    println("== Kotlin Functinos ==")

    fun greet(name: String): String{
        return "Hello $name"
    }

    fun add(a: Int, b: Int) = a + b

    fun introduce(name: String, age: Int=19){
        println("My name is $name and I'm $age years old")
    }

    println(greet("Kotlin"))
    println("Sum: ${add(5, 6)}")
    introduce("Sim")
    introduce("Kim", 23)
}

private fun week03Classes(){
    println("== Kotlin Classes ==")

    class Student{
        var name:String = ""
        var age: Int=0

        fun introduce(){
            println("Hi, I'm $name and I'm $age years old")
        }
    }

    val student = Student()
    student.name="심민식"
    student.age=23
    student.introduce()

    data class Person(val name:String, val age:Int) //data를 붙이면 값을 비교, data를 지우면 메모리주소를 비교

    val person1 = Person("Lee", 24)
    val person2 = Person("Lee", 24)

    println("Person1: $person1")
    println("Equal? : ${person1==person2}")
}

private fun week03Collections(){
    Log.d("KotlinWeek03","== Kotlin Collections ==")

    val fruits = listOf("apple", "banana", "orange")
    Log.d("KotlinWeek03","Fruits: $fruits")

    for(fruit in fruits){
        Log.d("KotlinWeek03","Fruit: $fruit")
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
    KotlinBasicsTheme {
        Greeting("Android")
    }
}