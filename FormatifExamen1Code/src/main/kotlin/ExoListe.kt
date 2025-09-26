package org.example

fun joursParMois(n: Int): List<Int>{
    if(n > 12){
        throw error("La valeur de n doit être plus petite que 12")
    }
    val joursParMois = listOf<Int>(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    return joursParMois.take(n)
}

fun main(){
    val jours = joursParMois(1)
    println(jours)
}
