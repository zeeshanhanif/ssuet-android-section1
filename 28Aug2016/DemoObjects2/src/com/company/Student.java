package com.company;

/**
 * Created by zeeshanhanif-pc on 8/28/2016.
 */
public class Student {

    private String name;
    private int age;
    private String address;

    public static String course;

    public Student(String name,int age, String address){
        this.name = name;
        this.age =age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
