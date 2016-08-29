package com.company;

/**
 * Created by zeeshanhanif-pc on 8/28/2016.
 */
public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name){
        this.name = name;
    }

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
