package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        System.out.println(a.size());
        a.add("Hello world");
        a.add("Hello asfsd");
        a.add("sadfasd");
        a.add("asdfas");
        a.add("w3s23sd");

        System.out.println(a.size());
        System.out.println(a.get(2));
        System.out.println(a.contains("Hello world"));
        System.out.println("-----");
        for(String s : a){
            System.out.println(s);
        }
    }
}
