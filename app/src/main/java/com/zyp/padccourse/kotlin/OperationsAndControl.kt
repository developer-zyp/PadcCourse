package com.zyp.padccourse.kotlin

fun main() {

    val age = 10
    when (age) {
        in 0..15 -> {
            println("under 16")
        }
        in 16..30 -> {
            println("under 30")
        }
        else -> {
            println("over 30")
        }

    }

    val numbers = listOf<Int>(10, 20, 30, 40, 50)

    for (i in numbers) {
        print("$i ")
    }

    println()

    for (i in numbers.indices) {
        print("$i ")
    }

    println()

    for ((index, value) in numbers.withIndex()) {
        print("[$index]=$value ")
    }

    println()

    for (i in 0..10 step 2) {
        print("$i")
    }

    println()

    for (i in 10 downTo 5) {
        print("$i")
    }

}