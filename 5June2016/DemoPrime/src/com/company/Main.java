package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 9;
        boolean isPrime = true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                //not prime
                //System.out.println("Not prime");
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
