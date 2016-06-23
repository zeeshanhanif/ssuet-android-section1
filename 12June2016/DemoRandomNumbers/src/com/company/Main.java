package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r = new Random();
        int a = r.nextInt();
        int b = r.nextInt(400);
        int c = r.nextInt(400)+100;
        int d = r.nextInt(10);
        System.out.println("Random = "+a);
        System.out.println("Random = "+b);
        System.out.println("Random = "+d);

    }
}
