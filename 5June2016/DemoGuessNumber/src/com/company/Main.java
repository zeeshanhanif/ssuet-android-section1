package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num=55;

        boolean IsContinue = false;
        //System.out.println(input);
        do
        {
            System.out.println("Please enter any number to guess");
            Scanner scan=new Scanner(System.in);
            int input=scan.nextInt();
            if(input==num) {
                System.out.println("your input is correct");
                break;
            }
            else
            {
                System.out.println("try again");
                System.out.println("Do you want to continue?");
                String s =scan.next();
                if (s.equals("Y")) {
                    IsContinue = true;
                }
            }
        }while(IsContinue);
    }
}
