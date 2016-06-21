package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 5;       //00000101
        int b = 6;       //00000110
        int c = a | b;   //00000111

        int a1 = 8;       //00001000
        int b1 = 7;       //00000111
        int c1 = a1 | b1; //00001111

        boolean a2 = false;
        boolean b2 = true;
        boolean c2 = a2 | b2;

        System.out.println("C = "+c);
        System.out.println("C1 = "+c1);
        System.out.println("C2 = "+c2);
    }
}
