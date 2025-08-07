package com.example.alexismobdev.Alexis

fun main(){
    val originalList = listOf(10, 20, 30, 40, 50)
    val reversedList = mutableListOf<Int>()

    for (i in originalList.size - 1 downTo 0) {
        reversedList.add(originalList[i])

    }
    println("original list: $originalList")
    println("reversed list: $reversedList")
}
