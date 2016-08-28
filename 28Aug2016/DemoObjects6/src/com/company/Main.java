package com.company;

public class Main {

    public static void main(String[] args) {
        University u = new University("SSUET");
        u.addStudent("Aziz",56);
        Student s1 = u.getStudent();
        System.out.println(s1.getName());
        System.out.println(u.getStudent().getName());

    }
}
