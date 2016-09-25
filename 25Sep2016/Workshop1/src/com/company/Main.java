package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Vehicle v = new Vehicle("White",34232,1996);
        Bus b = new Bus("Multicolor",12451,1990);
        Car c = new Car("Black",4544,2005);
        Truck t = new Truck("Multicolor",7845,1990);
        SportsCar sc = new SportsCar("RED",71245,2007);*/

        Vehicle vArr[] = new Vehicle[5];
        vArr[0] = new Vehicle("White",34232,1996);
        vArr[1] = new Bus("Multicolor",12451,1990);
        vArr[2] = new Car("Black",4544,2005);
        vArr[3] = new Truck("Multicolor",7845,1990);
        vArr[4] = new SportsCar("RED",71245,2007);

        Random r = new Random();
        int num = r.nextInt(5);
        System.out.println("NUM = "+num);
        Workshop workshop = new Workshop("Ghazi Workshop");
        workshop.provideService(vArr[num]);

    }
}
