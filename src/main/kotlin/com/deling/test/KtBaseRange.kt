package com.deling.test

fun main() {

   val range=1..10
    for(i in range)
        println("$i")

    println("=======================================")
    val rangeStep=1..10 step 2
    for(i in rangeStep)
        println("$i")

    println("=======================================")
    for (i in 1..10 step 3)
        println("$i")


}