package com.company;

/**
 * Created by zeeshanhanif-pc on 8/28/2016.
 */
public class University {
    private String name;
    private Student []students;
    int count = 0;

    public University(String name){
        this.name = name;
        students = new Student[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student stu){
        this.students[count++] = stu;
    }

    public void addStudent(String name, int age){
        this.students[count++] = new Student(name,age);
    }

    public Student getStudent(){
        return this.students[0];
    }
}
