package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = new int[5];
        int[] b = new int[1];
        int []c = new int[6];

        int [][]d = new int[3][2];

        a[0] = 5;
        a[1] = 6;

        d[0][0] = 5;
        d[0][1] = 1;

        d[1][0]= 5;
        d[1][1]= 55;

        d[2][0] = 66;
        d[2][1] = 44;

        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.println("d["+i+"]["+j+"] = "+d[i][j]);
            }
        }


    }
}
