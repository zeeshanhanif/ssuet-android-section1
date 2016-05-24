package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 8;
        int b = 8;
        //int c = ++a + --b - a++ + ++b;
        int c = 7 + 7 - 7 + 8;

        System.out.println("A = "+a);//7,9,6 == 8
        System.out.println("B = "+b);//7,8,9 == 8
        System.out.println("C = "+c);//18,13,15,9,0,-1


    }
}
