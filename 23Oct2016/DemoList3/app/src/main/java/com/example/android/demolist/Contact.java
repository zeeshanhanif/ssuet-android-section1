package com.example.android.demolist;

/**
 * Created by zeeshanhanif-pc on 10/23/2016.
 */
public class Contact {

    private String name;
    private int number;


    public Contact(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
