package com.marcosoft.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes()
        tipoDeDatos()
        resultado()
        loops()
    }

}/*
    Aquí definimos v aribles y constantes
     */
private fun variablesYConstantes(){
    //VARIABLES
    var myFirstVariable = "Hello Hacerman!"
    val myNamberOne= 2
    val myNamberTwo = 3
    val myNamberThree = myNamberOne+myNamberTwo
    println (myFirstVariable)
    println (myNamberThree)
}
private fun tipoDeDatos(){
    //Entero
    val myInt:Int = 1
    val myInt2 = 2
    val myInt3 = myInt + myInt2
    println(myInt3)

}
private fun resultado(){
    val myInt:Int = 3
    val myInt2 = 2
    val myInt3 = myInt + myInt2
    if  ((myInt3 > 4)) {
        println("El numero $myInt3 es mayor a 4")
    }
}
private fun loops(){
    val myArray:List<String> = listOf("Hola", "Bienvenidos al tutorial 2", "sudo")
    val myMap:MutableMap<String,Int> = mutableMapOf("Brais" to 1, "Pedro" to 2,"SARA" to 5)

    for (myString in myArray){
        println(myString)
    }
    for (myElement in myMap){
        println ("${myElement.key}-${myElement.value}")
    }
}