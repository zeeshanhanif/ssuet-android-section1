package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Human  {
    public String name;
    public int age;
    public String email;


    public Human(String name, int age){
        super();
        System.out.println("Human two argument");
        this.name = name;
        this.age = age;
    }



    public void study(){
        System.out.println("Human is sleeping..");
    }

    public void displayName(){
        System.out.println("Name = "+this.name);
    }

    /*public void displayQualification(){
        System.out.println("Qualifications = "+this);
    }*/

}
