package com.company;

/**
 * Created by zeeshanhanif-pc on 8/28/2016.
 */
public class MyMath {
    public static int min(int a, int b){
        return a > b ? b : a;
        /*if(a>b){
            return b;
        }
        else {
            return a;
        }*/
    }

    public static int max(int a, int b){
        return a < b ? b : a;

    }
}
