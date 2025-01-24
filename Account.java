/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Micro
 */
abstract class Account {
    private String name;
    private int age;
    private float salary;
    String getName(){
        return name;
    }
    
    void setName(String name){
    this.name=name;
    }
    float getSalary(){
        return salary;
    }
    
    void setSalary(float salary){
    this.salary=salary;
    }
    int getAge(){
        return age;
    }
    
    void setAge(int age){
    this.age=age;
    }
    
    void printUser(){
    System.out.println("name : "+name);
    System.out.println("age : "+age);
    System.out.println("salary : "+salary);
    }
    public Account(String name,int age,float salary){
    this.name=name;
    this.age=age;
    this.salary=salary;
    }
}
