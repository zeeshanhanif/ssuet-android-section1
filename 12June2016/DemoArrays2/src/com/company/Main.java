package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = new int[5];
        Random r = new Random();
        for(int i=0;i<a.length;i++){
            a[i] = r.nextInt(50);

        }

        for (int i=0;i<a.length;i++){
            System.out.println("I = "+i+" A[] = "+a[i]);
        }
    }
}
