package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Workshop workshop = new Workshop("Waqas's Workshop");
        Vehicle v = new Vehicle("White",34343,1996);
        Bus b = new Bus("Multicolor",2132,1980);
        Car c = new Car("Black",78457,2014);
        Truck t = new Truck("Multicolor",7845,1995);

        workshop.provideService(c);

        /*System.out.println("--");
        b.displayInfo();
        System.out.println("--");
        c.displayInfo();
        System.out.println("--");
        t.displayInfo();*/


    }
}
