package com.company;

/**
 * Created by zeeshanhanif-pc on 9/18/2016.
 */
public class SportsCar extends Car {

    public SportsCar(String color, int registrationNo, int model){
        super(color,registrationNo,model);
    }

    public void doService(){
        System.out.println("SportsCar Service");
    }
}
