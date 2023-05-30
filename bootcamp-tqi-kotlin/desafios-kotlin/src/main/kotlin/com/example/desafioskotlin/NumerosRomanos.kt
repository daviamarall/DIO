package com.example.desafioskotlin

fun main() {
    val numeroRomano: String? = readLine()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

   //imprimir o numeral romano convertido para inteiro
    var numeroInteiro = 0

    for (i in numeroRomano!!.indices) {
        val atual = numerosRomanos.getValue(numeroRomano[i])
        val proximo = when (i + 1) {
            numeroRomano.length -> 0
            else -> numerosRomanos.getValue(numeroRomano[i + 1])
        }
        // TODO("Criar a lógica para converter de numeral romano para inteiro")
        if (atual < proximo) {
            numeroInteiro -= atual
        } else {
            numeroInteiro += atual
        }

    }
    println(numeroInteiro)
}




