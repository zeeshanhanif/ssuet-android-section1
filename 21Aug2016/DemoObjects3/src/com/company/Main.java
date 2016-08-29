package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 6;
        int b = a;
        System.out.println(a);
        Student abc = new Student();
        System.out.println(abc);
        System.out.println(abc.name);
        System.out.println(abc.age);
        abc.study();
        //int xyz = abc.study();
        int value = abc.payFee();
        System.out.println(value);
        //System.out.println(abc.payFee());
    }
}
