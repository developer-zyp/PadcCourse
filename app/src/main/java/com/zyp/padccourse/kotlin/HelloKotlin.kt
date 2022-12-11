package com.zyp.padccourse.kotlin

val value3: String = ""     // val and var must assign initial value
var value4: String = ""

lateinit var value2: String

fun main() {
    println("Hello Kotlin")

    val value = "Readonly value"
//    value = "Write value"   //val cannot be assign

    var value1 = "Read and Write"
    value1 = "Assign value"

    value2 = "Assign value"     //lateinit must assign value later
    println(value2)

//    Person().name = ""  //get,set in kotlin


//    val person = Person()
//    person.name = ""

    val person2 = Person(name = "MgMg")

}