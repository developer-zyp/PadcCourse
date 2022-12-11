package com.zyp.padccourse.java;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
//        if(!name.equals("")){
//            this.name = name;
//        }
        this.name = name;
    }


    public static void getPersonInfo(){}

}
