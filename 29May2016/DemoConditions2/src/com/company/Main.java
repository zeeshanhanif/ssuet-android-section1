package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int marks = 60;
        if(marks >= 40 && marks < 50){
            System.out.println("E");
        }
        else if(marks >= 50 && marks <60){
            System.out.println("D");
        }
        else if(marks >= 60 && marks < 70){
            System.out.println("C");
        }
        else if(marks >= 70 && marks < 80){
            System.out.println("B");
        }
        else if(marks >= 80){
            System.out.println("A");
        }
        else {
            System.out.println("Fail");
        }

    }
}
