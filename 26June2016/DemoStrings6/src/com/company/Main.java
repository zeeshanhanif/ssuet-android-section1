package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String st = "Hello World";
        String starr[] = st.split(" ");

        String st2 = "Hello,world,abc,xyz,yes,no,working";
        String st2arr[] = st2.split(",");
        String st2arr1[] = st2.split("o");
        /*for(int i=0;i<starr.length;i++){
            System.out.println(starr[i]);
        }*/
        for(int i=0;i<st2arr1.length;i++){
            System.out.println(st2arr1[i]);
        }

/*
        25
                Twenty Five
*/





    }
}
