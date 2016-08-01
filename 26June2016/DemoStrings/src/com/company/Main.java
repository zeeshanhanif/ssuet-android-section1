package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String st = new String("Hello World");
        String st1 = "Hello World";
        String st2 = "Hello World";
        String st3 = new String("Hello World");

        System.out.println(st==st1);
        System.out.println(st==st3);
        System.out.println(st1==st2);
        //System.out.println(st1==st2);
    }
}
