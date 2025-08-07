package com.example.alexismobdev.Alexis

fun main(){
    val grades = listOf(85, 42, 70, 58, 90)

    for(grade in grades){
        if (grade >= 60){
            println("$grade: Pass")

        } else{
            println("$grade: Fail")

        }
    }
}

