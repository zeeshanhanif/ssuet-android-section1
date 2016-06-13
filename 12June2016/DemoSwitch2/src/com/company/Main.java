package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r = new Random();
        int a = r.nextInt(6);

        char c = 'A';
        switch (c){
            case 1:
                System.out.println("1 = "+a);
                break;
            case 2:
                System.out.println("2 = "+a);
            case 3:
                System.out.println("3 = "+a);
                break;
            case 4:
                System.out.println("4 = "+a);
                break;
            case 5:
                System.out.println("5 = "+a);
                break;
            default:
                System.out.println("Not found = "+a);
                break;
        }
    }
}
