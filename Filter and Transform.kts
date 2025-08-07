package com.example.alexismobdev.Alexis

fun main() {
    val numbers = 1..20
    val evenNumbersDoubled = numbers
        .filter { it % 2 == 0 }
        .map { it * 2 }
    println("Even numbers doubled: $evenNumbersDoubled")
}
