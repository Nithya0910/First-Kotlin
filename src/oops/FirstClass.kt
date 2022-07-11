package oops

import java.util.*

open class Person (open val name: String, open var age:Int){
   // var name: String
    //var age: Int

    init {

        println("Object was created")
    }

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name !")
    }

//    fun getYearOfBirth():Int{
//        return 2022-age
//    }

    fun getYearOfBirth() = 2022 - age
}

class Student(override  val name: String,override var age: Int,val studentId:Long):Person(name, age ){
    fun isIntelligent()=true
}

class Employee(override val name: String,override var age: Int):Person(name,age){

    fun receivePayment(){
        println("Payment received")
    }
}

fun main(args: Array<String>) {
   val student = Student("Hello",8,78)
    student.speak()
    println(student.isIntelligent())

    val employee = Employee("Hello",78)
    employee.receivePayment()
}