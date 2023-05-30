package com.example.kotlinexemplos

fun someCondition() = true

fun main() {

    var d: Int = 2
    if (someCondition()){
        d = 2
    } else {
        d = 4
    }
    println(d)
}