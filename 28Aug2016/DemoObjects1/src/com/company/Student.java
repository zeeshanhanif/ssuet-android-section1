package com.company;

/**
 * Created by zeeshanhanif-pc on 8/28/2016.
 */
public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public void setName(String a){
        name = a;
    }
}
