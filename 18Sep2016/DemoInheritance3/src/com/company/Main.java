package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human h = new Human();
        Teacher t = new Teacher();
        Student s = new Student();

        h.name = "Hello";
        t.name = "Aziz";
        s.name = "Umair";
        t.qualifications = "BBA, MBA";
        s.rollNo = 23;

        h.study();
        t.study();
        s.study();
        System.out.println("---");

        Human hh = new Student();
        Human ht = new Teacher();

        hh.study();
        ht.study();


    }
}
