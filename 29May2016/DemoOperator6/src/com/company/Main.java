package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 5;
        int b = 6;

        //boolean c2 = a < 4 || b < 3;
        //boolean c2 = a < 4 || b > 3;
        boolean c2 = a > 4 || b++ < 3;
        //boolean c1 = false && true;

        System.out.println("B = "+b);
        System.out.println("C = "+c2);
    }
}
