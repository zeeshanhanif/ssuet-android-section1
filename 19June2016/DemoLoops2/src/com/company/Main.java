package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []arr = new int[10];
        Random r = new Random();
        boolean isMatched = false;
        for(int i=0;i<arr.length;i++){
            isMatched = false;
            arr[i] = r.nextInt(10);
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isMatched = true;
                    break;
                }
            }
            if(isMatched){
                i--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
