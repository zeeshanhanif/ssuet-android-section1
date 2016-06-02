package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int marks = 66;
        if(marks >= 40 && marks < 50){
            System.out.println("E");
            if(marks > 45){
                System.out.println("You are at higher end of E");
            }

        }
        else if(marks >= 50 && marks <60){
            System.out.println("D");
            if(marks > 55){
                System.out.println("You are at higher end of D");
            }

        }
        else if(marks >= 60 && marks < 70){
            System.out.println("C");
            if(marks > 65){
                System.out.println("You are at higher end of C");
            }

        }
        else if(marks >= 70 && marks < 80){
            System.out.println("B");
            if(marks > 75){
                System.out.println("You are at higher end of B");
            }

        }
        else if(marks >= 80){
            System.out.println("A");
            if(marks > 90){
                System.out.println("You are at higher end of A");
            }

        }
        else {
            System.out.println("Fail");
        }
    }
}
