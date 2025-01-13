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
public class Order implements printTable{
    private String discription;
    private static int id=0;
    private Doctor doctor;
    private Patient patient;
    private ArrayList<Midicien>midicens;
    private Category category;
    
    
    
    int getId(){
    return id;
    }
    String getDiscription(){
    return discription;
    }
    void setDiscription(String discription){
    this.discription=discription;
    }
    Category getCategory(){
    return category;
    }
    void setCategory(Category category){
    this.category=category;
    }
    Doctor getDoctor(){
    return doctor;
    }
    void setDoctor(Doctor doctor){
    this.doctor=doctor;
    }
    Patient getPatient(){
    return patient;
    }
    void setPatient(Patient patient){
    this.patient=patient;
    }
    
    ArrayList<Midicien> getMidicens(){
    return midicens;
    }
    void setMidicens(ArrayList<Midicien> midicen){
    this.midicens=midicen;
    }
    
    
    
    
        @Override
    public void printOrderUser() {
        System.out.println("Order : "+this.toString());
        System.out.println("id : "+id);
        System.out.println("discription : "+discription);
        System.out.println("doctor name's : "+doctor.getName());
        System.out.println("category : "+category.name);
        if(patient!=null)System.out.println("Patient : "+patient.getName());
        System.out.println("   Midicens");
        
        int count=0;
        
        for(Midicien m :midicens){
        count++;
        System.out.println("name =  : "+m.name);
        System.out.println("date to End =  : "+m.dateToEnd);
        System.out.println("price =  : "+m.getPrice());
        System.out.println("painted Side =  : "+m.getPaintSide());
        System.out.println("painted =  : "+m.getPaint());
        
        System.out.println("** "+count+" **");
        
        }
    }
    
        @Override
    public void printDateUser() {
        System.out.println("Order : "+this.toString());
        System.out.println("id : "+id);
        System.out.println("discription : "+discription);
        System.out.println("doctor name's : "+doctor.getName());
        System.out.println("category : "+category.name);
        if(patient!=null)System.out.println("Patient : "+patient.getName());
   }

    
    
    double getPriceOrder(){
    double totalPrice=0;
    for(Midicien m:midicens){
        totalPrice+=m.getPrice();
    }
    
     return totalPrice;   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Order(String discription,Doctor doctor,Patient patient,Category category,ArrayList<Midicien>midicens){
        id++;
        this.discription=discription;
        this.doctor=doctor;
        this.patient=patient;
        this.midicens=midicens;
        this.category=category;  
    }
    
    
    public Order(String discription,Doctor doctor,Category category,ArrayList<Midicien>midicens){
        id++;
        this.discription=discription;
        this.doctor=doctor;
        this.midicens=midicens;
        this.category=category;  
    }



}
