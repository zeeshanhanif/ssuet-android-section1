package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList a = new ArrayList();
        System.out.println(a.size());
        a.add("Hello world");
        a.add(34);
        a.add(34.34);
        a.add(true);
        a.add(true);
        a.add(true);
        a.add(true);
        System.out.println(a.size());
        System.out.println(a.get(2));
        System.out.println(a.contains("Hello world"));
        System.out.println("-----");
        for(Object o : a){
            System.out.println(o);
        }



    }
}
