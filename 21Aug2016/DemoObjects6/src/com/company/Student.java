package com.company;

/**
 * Created by zeeshanhanif-pc on 8/21/2016.
 */
public class Student {
    private String name;
    private int age;

    public Student(String n,int a){
        name = n;
        age = a;
        System.out.println("Hello");
    }

    @Override
    public String toString(){
        return  "Helelo";
    }


    public void setName(String a){
        name = a;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
}
