package com.company;

/**
 * Created by zeeshanhanif-pc on 8/28/2016.
 */
public class MyMath {
    public static int min(int a, int b){
        return a > b ? b : a;
    }
    public static int min(int a, int b,String c){
        return a > b ? b : a;
    }

    public static int min(double a,double b){
        //return a > b ? b : a;
        return 45;
    }

    /*public static double minDouble(double a, double b){
        return a > b ? b : a;
    }*/

    public static int max(int a, int b){
        return a < b ? b : a;

    }
}
