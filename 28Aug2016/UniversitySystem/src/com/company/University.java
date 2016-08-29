package com.company;

/**
 * Created by zeeshanhanif-pc on 8/28/2016.
 */
public class University {
    private String name;
    private Student stu;

    public University(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student stu){
        this.stu = stu;
    }

    public Student getStudent(){
        return stu;
    }
}
