package com.example.trudnekonsolowe

import kotlin.random.Random

fun diceRoll(): Int{
    return Random.nextInt(1,7)
}

fun main(){
    val result = diceRoll()
    println("Rzut kostką: $result")
}

