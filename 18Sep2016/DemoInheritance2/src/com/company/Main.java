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

        h.displayName();
        s.displayName();
        t.displayName();
        System.out.println();
        t.displayQualification();



    }
}
