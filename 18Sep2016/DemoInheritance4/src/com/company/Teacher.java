package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Teacher extends Human {

    public String qualifications;

    public Teacher(){
        super("xyz",22);
        System.out.println("Teacher empty argument");
    }

    public void displayQualification(){
        System.out.println("Qualifications = "+this.qualifications);
    }

    public void study(){
        System.out.println("Teacher is sleeping..");
    }
}
