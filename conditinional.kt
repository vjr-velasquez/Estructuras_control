package com.vvelasquez.fundamentos

fun main(){
    condicionesIfElse1()
}
fun condicionesIfElse1(){
    //Condicion para tener DPI
    val edadActual: Int = 18
    val edadDPI: Int = 18

    if(edadActual >= edadDPI){
        print("Ustes es mayor de edad")
    }else if(edadActual < edadDPI){
        print(
            "Usted es menor de edad"
        )
    }else{
        print("Edad ingresada no correcta")
    }
}