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
public class Phrames implements knowAllThingAboutSystem{
 private ArrayList<Patient>patients;
 private ArrayList<Midicien>midicens;
 private ArrayList<Doctor>doctors;
 private ArrayList<Order>orders;
 
 
 public void addMidicen(ArrayList<Midicien>midicens){
    if(midicens.isEmpty())System.out.println("sorry midicen is empty not can add any thing");
    else{
        
        for(Midicien medicien:midicens)
            this.midicens.add(medicien);
        
        System.out.println("done do it");
    }
 }
 public void addMidicen(Midicien midicen){
 if(CheckOnMidicen(midicen))System.out.println("sorry this medicien is here");
 else {
      midicens.add(midicen);
      System.out.println("done add it.");
    }  
 }
 
 public void addDoctor(ArrayList<Doctor>doctors){
     if(doctors.isEmpty())System.out.println("sorry doctor is empty not can add any thing");
    else{
        
        for(Doctor doctor:doctors)
            this.doctors.add(doctor);
        
        System.out.println("done do it");
    }
 }
 public void addDoctor(Doctor doctor){
  if(CheckOnDoctor(doctor))System.out.println("sorry this doctor is here");
 else {
      doctors.add(doctor);
      System.out.println("done add it.");
    }  
 }
 
 public void addPatient(ArrayList<Patient>patients){
     if(patients.isEmpty())System.out.println("sorry patient is empty not can add any thing");
    else{
        
        for(Patient patient:patients)
            this.patients.add(patient);
        
        System.out.println("done do it");
    }
 }
 public void addPatient(Patient patient){
   if(CheckOnPatient(patient))System.out.println("sorry this patient is here");
 else {
      patients.add(patient);
      System.out.println("done add it.");
    }  
 }

 public void addOrder(ArrayList<Order>orders){
     if(orders.isEmpty())System.out.println("sorry order is empty not can add any thing");
    else{
        
        for(Order order:orders)
            this.orders.add(order);
        
        System.out.println("done do it");
    }
 }
 public void addOrder(Order order){
    if(CheckOnOrder(order))System.out.println("sorry this order is here");
 else {
      orders.add(order);
      System.out.println("done add it.");
    }  
 }
 
 
 public void deleteMidicen(Midicien midicen){
    if(CheckOnMidicen(midicen)){
        midicens.remove(midicen);
          System.out.println("done add it.");
    }
    else System.out.println("this midicen not in System");
 }
 
 public void deleteDoctor(Doctor doctor){
     if(CheckOnDoctor(doctor)){
        doctors.remove(doctor);
         System.out.println("done add it.");
    }
    else System.out.println("this doctor not in System");
 }
 
 public void deletePatient(Patient patient){
      if(CheckOnPatient(patient)){
        patients.remove(patient);
         System.out.println("done add it.");
    }
    else System.out.println("this patient not in System");
 }
 
 public void deleteOrder(Order order){
       if(CheckOnOrder(order)){
        orders.remove(order);
         System.out.println("done add it.");
    }
    else System.out.println("this order not in System");
 }
 
 public void printAllDoctors(){
     if(doctors.isEmpty())System.out.println("not have any doctors");
     else{
     System.out.println("Doctors :");
         
     for(Doctor doctor:doctors)
            doctor.printDateUser();  
     }
 }
 public void printAllOrders(){
      if(orders.isEmpty())System.out.println("not have any orders");
     else{
        
        System.out.println("Orders:");
        
        for(Order order:orders)
            order.printOrderUser();
     }
 }
 public void printAllMidicens(){
       if(midicens.isEmpty())System.out.println("not have any mediciens");
     else{
        
        System.out.println("Mediciens:");
        
        for(Midicien midicen:midicens)
            midicen.printMidicen();
     }
 }
 public void printAllPatients(){
        if(patients.isEmpty())System.out.println("not have any mediciens");
     else{
        
        System.out.println("Patients:");
        
        for(Patient patient:patients)
            patient.printUser();
     }
 }
 
 public ArrayList<Doctor>getDoctors(){
    return doctors;
 }
 public ArrayList<Order>getOrders(){
 return orders;
 }
 public ArrayList<Midicien>getMidicens(){
 return midicens;
 }
 public ArrayList<Patient>getPatients(){
 return patients;
 }
 
 public boolean CheckOnDoctor(Doctor doctor){
     for(Doctor doc:doctors)
         if(doctor.equals(doc))
             return true;
    
     return false;
 }
 
 public boolean CheckOnMidicen(Midicien midicen){
      for(Midicien mid:midicens)
         if(midicen.equals(mid))
             return true;
    
     return false;
 }
 
 public boolean CheckOnOrder(Order order){
      for(Order ord:orders)
         if(order.equals(ord))
             return true;
    
     return false;
 }
 
 public boolean CheckOnPatient(Patient patient){
      for(Patient pat:patients)
         if(patient.equals(pat))
             return true;
    
     return false;
 }
 
    
         
    @Override
    public void printAllThing() {
        this.printAllDoctors();
        this.printAllOrders();
        this.printAllMidicens();
        this.printAllPatients();
    }
}
