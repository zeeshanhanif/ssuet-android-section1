package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Hello World";
        int index = s.indexOf('o');
        int index2 = s.indexOf('Z');
        int index3 = s.indexOf("o",6);
        int index4 = s.indexOf('o',8);

        int lastIndex1 = s.lastIndexOf("o");

        System.out.println(index);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println(lastIndex1);
    }
}
