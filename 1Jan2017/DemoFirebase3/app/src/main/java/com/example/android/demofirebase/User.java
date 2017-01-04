package com.example.android.demofirebase;

/**
 * Created by zeeshanhanif-pc on 1/1/2017.
 */
public class User {

    private String userName;
    private String firstName;
    private String lastName;

    public User(){

    }
    public User(String userName,String firstName, String lastName) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
