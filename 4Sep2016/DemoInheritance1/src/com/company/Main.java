package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student();
        s.name = "Aziz";
        s.age = 5;


        AndroidStudent stu = new AndroidStudent();
        stu.name = "Umair";
        stu.age = 50;
        stu.qualification = "BS";
        //stu.email = "asd"
        System.out.println(s);
        System.out.println(stu);
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.getName());
        System.out.println("----");
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.qualification);
        System.out.println(stu.getName());
    }
}
