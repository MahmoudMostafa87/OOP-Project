/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author Micro
 */
public class Patient extends Account{
private ArrayList<Midicien> listOfmidicen;
private float currentPrice;
private String discription;

void BuyOrder(Order order){
    if(currentPrice<=0)System.out.println("not can Buy any thing you not have money");
    else{
        if(!canBuyOrder(order))System.out.println("not can Buy any thing you not have money");
        else{
        currentPrice-=order.getPriceOrder();
        order.setPatient(this);
        System.out.println("Patient "+super.getName());
        System.out.println("buy this Order "+ order.toString());
        }
    }
}


float getCurrentPrice(){
   return currentPrice; 
}

void addMonay(float monay){
    currentPrice+=monay; 
}

boolean canBuyOrder(Order order){
    return order.getPriceOrder() <= currentPrice;
}

void setDiscription(String text){
    discription=text;
}

String getDiscription(){
    return discription;
}










public Patient(String name,int age,float salary,ArrayList<Midicien>midiciens,String discription){
    super(name,age,salary);
    currentPrice=salary;
    listOfmidicen=midiciens;
    this.discription=discription;
}
public Patient(String name,int age,float salary,String discription){
    super(name,age,salary);
    currentPrice=salary;
    listOfmidicen=new ArrayList();
    this.discription=discription;
}
    
}
