/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentdetailsprint;

/**
 *
 * @author dhruvil
 */
public class Student {
    private String Name;
    private int age;
    
    //define constructor to set values for the local variables
    public Student(String n,int a){
        this.Name = n;
        this.age = a;
        
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
}
