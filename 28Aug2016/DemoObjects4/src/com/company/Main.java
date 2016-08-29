package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student("Aziz","Karachi",45);
        Student s1 = new Student("Aziz");
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
