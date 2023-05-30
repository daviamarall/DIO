package com.example.desafioskotlin

fun main(){
    val entrada: String? = readLine()

    // Utiliza o conceito de "destructuring" para atribuir cada parte da data (dia/mes/ano).
    val (dia, mes, ano) = entrada!!.split("/")
    val data = "$dia de $mes de $ano"
    val mesPorExtenso = when(mes.toInt()){
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "mês inválido"
    }
    println("$dia de $mesPorExtenso de $ano")
}