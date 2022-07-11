package functions

import java.util.*

fun helloWorld() {
    println("Hello world")
}

//Takes parameter - No returns value
fun printWithSpaces(text: String) {
    for (i in text) {
        print("$i ")

    }
    println()
}

// No Parameters - Returns value
fun getCurrentDate():Date{
    return Date()
}

//Two Parameters - Returns value
fun max(a:Int, b:Int):Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("Hello")
    println(getCurrentDate())
    println(max(3,5))
}