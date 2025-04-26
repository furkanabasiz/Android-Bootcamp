package com.example.firstlessonapp.firstWeek.hw2

class Functions {

    fun fahrenheit(celcius: Int): Double {
        return celcius * 1.8 + 32
    }

    fun rectangular(short: Int , long : Int): Int{
        return short*2 + long*2
    }

    fun factorial(i: Int): Int{

        var factorial = 1

        for (i in i downTo 1){
            factorial = i * factorial
        }
        return factorial
    }

    fun afinder(word: String): Int{

        var counter = 0

        for (letter in word){
            if (letter == 'a' || letter == 'A' ){
                counter++
            }
        }
        return counter
    }

    fun angles(corner: Int): Int{
        return (corner-2) * 180
    }

    fun wage(day : Int): Int{
        var hour = day * 8
        var price = 0

        if (hour > 160){
            price = 160 * 10 + (hour - 160) * 20
        }
        else if (hour <= 160){
            price = hour * 10
        }
        return price
    }
}