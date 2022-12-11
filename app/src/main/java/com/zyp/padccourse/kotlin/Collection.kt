package com.zyp.padccourse.kotlin

val list = listOf(1, 2, 3)
val myMutableList = mutableListOf<Int>(1, 2, 3)

val myMap = mapOf<Int, String>(1 to "1", 2 to "2", 3 to "3")
val myMutableMap = mutableMapOf<String, String>("a" to "apple", "b" to "banana")

val mySet = setOf<Int>()
val myMutableSet = mutableSetOf<String>("a", "a", "b", "c")


fun main() {
    myMutableList.add(4)
    myMutableMap["c"] = "coconut"
    myMutableMap.put("d", "durin")
    myMutableSet.add("b")

}


