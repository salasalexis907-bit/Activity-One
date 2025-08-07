package com.example.alexismobdev.Alexis

fun main() {
    val mixedList = listOf(42, "Hello", 3.14, "World", false)

    for (item in mixedList) {
        when (item) {
         is Int -> println("$item is an Integer")
         is String -> println("\"$item\" is a String")
         is Boolean -> println("\"$item\" is a Boolean")
         is Double -> println("\"$item\" is a Double")
         else -> println("$item is of unknown type")
        }
    }
}

