package com.zyp.padccourse.java;

public class HelloJava {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        final String value = "Readonly value";
//        value = "Write value";  //cannot assign to readonly value - final

        String value1 = "Read and Write value";
        value1 = "Assign value";


        Person.getPersonInfo();

//        new Person().getName();
//        new Person().setName("");


    }

}
