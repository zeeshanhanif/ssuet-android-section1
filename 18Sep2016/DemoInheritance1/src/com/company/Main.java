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

        System.out.println(h.name);
        System.out.println(t.name);
        System.out.println(s.name);
        System.out.println();
        System.out.println(t.qualifications);
        System.out.println(s.rollNo);
/*
        h.study();
        s.study();
        t.study();*/

        h.displayName();
        s.displayName();
        t.displayName();


    }
}
