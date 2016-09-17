package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student("Aziz",40);
        University u = new University("SSUET");
        u.addStudent(s);

        System.out.println(u.getName());
        System.out.println(s.getName());

        String a = u.getName();
        Student abc = u.getStudent();
        System.out.println(abc.getName());
        System.out.println(u.getStudentName());
    }
}
