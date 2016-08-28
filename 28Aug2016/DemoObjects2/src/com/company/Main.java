package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //
        System.out.println(Student.course);
        Student.course = "Android";
        System.out.println(Student.course);
        Student s = new Student("Aziz",34,"Karachi");
        System.out.println(s.course);

        System.out.println(MyMath.min(3,6));
        System.out.println(MyMath.max(3,6));






    }
}
