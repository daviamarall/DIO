package com.example.desafioskotlin

fun main() {

    println("Digite a primeira nota: ")
    val media = readLine()!!.toDouble();

    when {

        media < 5 -> println("REP")
        media >= 7.0 -> println("APR")
        media >= 5.0 -> println("REC")

    }
    // Hello, world!
}

