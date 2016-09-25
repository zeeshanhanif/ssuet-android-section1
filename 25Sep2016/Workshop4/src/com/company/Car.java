package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class Car extends Vehicle {

    public Car(String color, int registrationNo, int model){
        super(color,registrationNo,model);
    }

    public final void doService(){
        System.out.println("Car Service");
    }
}
