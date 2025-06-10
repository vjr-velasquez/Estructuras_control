package com.vvelasquez.fundamentos

fun main(){
    //condicionalWhen()
    condicionalWhen2(7)
}
/*fun condicionalWhen(){
    //Conocer los dias de la semana por su numero
    val dia = 5
    when(dia){
        1 -> print("El dia de la semana es Lunes")
        2 -> print("El dia de la semana es Martes")
        3 -> print("El dia de la semana es Miercoles")
        4 -> print("El dia de la semana es Jueves")
        5 -> print("El dia de la semana es Viernes")
        6 -> print("El dia de la semana es Sabado")
        7 -> print("El dia de la semana es Domingo")
        else -> print("Dia de la semana es incorrecto")
    }
}*/
fun condicionalWhen2(nota: Int?) {
    if (nota == null) {
        println("Por favor ingrese una nota")
    } else {
        val resultado = when (nota) {
            in 0..5 -> "Nota reprobada"
            in 6..10 -> "Nota aprobada con Excelencia"
            else -> "Nota fuera del rango establecido"
        }
        println("El resultado es: $resultado")
    }
}