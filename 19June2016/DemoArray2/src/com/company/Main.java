package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int b[] = new int[2];
        b[0] = 5;
        Random r = new Random();
        int [][]a = new int[2][];
        a[0] = new int[3];
        a[1] = new int[5];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = r.nextInt(100);
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print("a["+i+"]["+j+"] = "+a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
