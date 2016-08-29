package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student st= new Student();
        //st.name= "Aziz";
        //System.out.println(st.name);
        st.setName("Junaid");
        st.setAge(105);
        System.out.println(st.getName());
        System.out.println(st.getAge());

    }
}
