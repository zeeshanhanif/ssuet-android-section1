package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Student extends Human {

    public int rollNo;

    public Student(){
        super("abc",34);
        System.out.println("Student empty argument");
    }

    public Student(String name, int age){
        super(name,age);
    }


    public void study(){
        System.out.println("Student is sleeping..");
    }

}
