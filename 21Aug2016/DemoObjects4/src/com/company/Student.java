package com.company;

/**
 * Created by zeeshanhanif-pc on 8/21/2016.
 */
public class Student {
    private String name = "Hello World";
    private int age = 5;

    public void setName(String xyz){
        //System.out.println(xyz);
        name = xyz;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        if(a > 100){
            System.out.println("Incorrect age, age should be less then 100");
        }
        else {
            age = a;
        }
    }

    public int getAge(){
        return age;
    }
}
