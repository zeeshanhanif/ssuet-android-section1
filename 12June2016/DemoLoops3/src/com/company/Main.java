package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        outer:
        for(int i=0;i<5;i++){
            inner:
            for(int j=0;j<3;j++){
                System.out.println("I = "+i+" J = "+j);
                if(j==2){
                    break outer;
                }
            }
        }

    }
}
