package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []arr = new int[10];
        Random r = new Random();
        int count;
        for(int i=0;i<arr.length;i++){
            do{
                arr[i] = r.nextInt(10);
                count = 0;
                while(arr[i]!=arr[count]){
                    count++;
                }
            }while(i!=count);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
