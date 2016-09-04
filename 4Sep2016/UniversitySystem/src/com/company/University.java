package com.company;

/**
 * Created by zeeshanhanif-pc on 9/4/2016.
 */
public class University {

    private String name;
    private Student student;

    public University(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addStudent(Student student){
        this.student = student;
    }
    public Student getStudent(){
        return this.student;
    }

    public String getStudentName(){
        return this.student.getName();
    }
}
