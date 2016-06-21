package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[];
        int b[] = new int[3];
        int c[] = new int[]{2,7,8,7,8,5,9,7};
        System.out.println(c.length);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }

        int d[][] = new int[][]
                {
                        {3,4,5},
                        {6,7,8},
                        {3,6,7,8}
                };

        System.out.println("  x |    |    ");
        System.out.println("--------------");
        System.out.println("    |    |    ");
        System.out.println("--------------");
        System.out.println("    |    |    ");

    }
}
