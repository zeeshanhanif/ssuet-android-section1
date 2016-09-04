package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        University u = new University("SSUET");
        Student s = new Student("Aziz",5);
        Student s1 = new Student("Umair1",10);
        Student s2 = new Student("Umair2",10);
        Student s3 = new Student("Umair3",10);
        Student s4 = new Student("Umair4",10);
        u.addStudent(s);
        u.addStudent(s1);
        u.addStudent(s2);
        u.addStudent(s3);
        u.addStudent(s4);
        System.out.println(u.getStudentName());
        //Student ss = u.getStudent();
        Student ss = u.getStudentByIndex(3);
        System.out.println(ss.getName());

        //getStudentByName("Umair2");
    }
}
