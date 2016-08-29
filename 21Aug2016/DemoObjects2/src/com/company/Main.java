package com.company;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s.name);
        System.out.println(s1.name);
        System.out.println(s2.name);

        s.name = "Aziz";
        s1.name = "45";

        System.out.println(s.name);
        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}
