package com.vvelasquez.fundamentos

fun main(){
    //condicionalWhen()
    //condicionalWhen2(7)

    // Guardar el resultado en una variable para evitar múltiples llamadas
    val resultado = condicionalWhen3()
    if (resultado == 1)
        print("Es una unidad")
    else if (resultado == 10)
        print("Es una decena")
    else if (resultado == 100)
        print("Es una centena")
    else
        print("Fuera de rango")
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

// ✅ Agregado tipo de retorno Int
fun condicionalWhen3(): Int {
    //reconocer unidades , decenas y centenas
    val x = 1
    val retorno = when(x){
        in 0..9 -> 1
        in 10..99 -> 10
        in 100..999 -> 100
        else -> 0
    }
    return retorno
}