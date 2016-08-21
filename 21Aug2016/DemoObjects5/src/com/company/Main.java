package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int st;
        st = 5;
        System.out.println(st);
        Student st1 = new Student();
        st1.setAge(34);
        st1.setName("Aziz");
        System.out.println(st1.getAge());
        System.out.println(st1.getName());

    }
}
