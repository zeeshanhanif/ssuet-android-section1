package com.company;

/**
 * Created by zeeshanhanif-pc on 9/4/2016.
 */
public class University {

    private String name;
    //private Student student;
    private Student stu[];
    private int studentCount;

    public University(String name){
        this.name = name;
        stu = new Student[4];
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void addStudent(Student student){
        //this.student = student;
        if(studentCount == this.stu.length){
            System.out.println("No space available");
        }
        else {
            this.stu[studentCount] = student;
            studentCount++;
        }
    }

    public Student getStudent(){
        return this.stu[0];
    }

    public Student getStudentByIndex(int index){
        return this.stu[index];
    }

    public String getStudentName(){
        return this.stu[0].getName();
    }
}
