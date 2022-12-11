package com.zyp.padccourse.kotlin

open class Person(name: String) {

    //Class Inheritance Method override
    open fun eat() {

    }

    fun sleep() {

    }

    fun work() {

    }


    //Constructor
    constructor() : this(name = "")

//    init {
//        name
//    }
//
//    fun doSomething() {
//
//    }


    //Encapsulation
//    var name: String = "Aung Aung"
//        private set(value) {
//            if (value.isNotEmpty()) {
////            name = value
//                field = value
//            }
//        }


    //NULL Safe
    companion object {

        val email: String? = null
        fun getPersonInfo() {

            //1
            if (email != null) {
                //null safe
            }

            //2
            email?.let {
                //null safe
            }

            //3
            val data = email ?: ""
            //data is null safe


        }


    }


}