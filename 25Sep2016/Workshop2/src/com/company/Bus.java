package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Bus extends Vehicle {

    public Bus(String color, int registrationNo, int model){
        super(color,registrationNo,model);
    }

    public void doService(){
        System.out.println("Bus Service");
    }
}
