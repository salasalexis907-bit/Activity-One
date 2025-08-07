package com.example.alexismobdev.Alexis

fun main() {
    val numbers = listOf(12, 47, 85, 23, 90, 14)

    var max = numbers[0]
    for(num in numbers){
        if(num > max) {
            max = num

        }
    }
    println("Maximum number is: $max")
}

