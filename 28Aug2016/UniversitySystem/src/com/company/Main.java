package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        University u = new University("SSUET");
        Student s = new Student("Aziz",34);
        u.addStudent(s);
        Student s1 = u.getStudent();
        System.out.println(s1.getName());
        System.out.println(u.getStudent().getName());



    }
}
