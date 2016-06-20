package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = new String("Hello World");
        String s0 = new String("Hello World");
        String s1 = "Hello World";
        String s2 = "Hello World";
        System.out.println(s);
        System.out.println("Hello World");
        System.out.println(s.charAt(0));

        System.out.println(s==s0);
        System.out.println(s1==s2);
    }
}
