package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human h = new Human("Aziz",23);
        Student s = new Student();

        Student s1 = new Student("Umair",34);

        System.out.println(h.name);
        System.out.println(s.name);
        System.out.println(s1.name);


        /*Teacher t = new Teacher();
        Student s = new Student();*/


    }
}
