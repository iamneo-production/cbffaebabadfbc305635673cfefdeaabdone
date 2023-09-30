package com.examly.springapp.model;
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    public void setStudentId(int i){studentId=i;}
    public void setFirstName(String i){firstName=i;}
    public void setLastName(String i){lastName=i;}

    public int getStudentId(){return studentId;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
}

