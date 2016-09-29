package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Truck extends Vehicle {

    public Truck(String color, int registrationNo, int model){
        super(color,registrationNo,model);
    }


    public void doService(){
        System.out.println("Truck Service");
    }
}
