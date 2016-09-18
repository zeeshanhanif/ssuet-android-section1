package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Workshop {

    private String name;

    public Workshop(String name){
        this.name = name;
    }


    public void provideService(Vehicle v){
        v.doService();
    }
}
