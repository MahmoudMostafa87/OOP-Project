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
public class Category {
    public String name;
    private ArrayList<Midicien>midicens;
    
    public void addMidicen(Midicien Name){
        midicens.add(Name);
    }
    public void setMidicen(Midicien Name){
        if(midicens.isEmpty())System.out.println("is Empty not can update "+Name);
        else{
        boolean isUpdated=false;    
        for(Midicien m:midicens){
            if(m.name.equalsIgnoreCase(Name.name)){
                midicens.remove(m);
                midicens.add(Name);
                isUpdated=true;
                }
            }
            if(isUpdated)
                System.out.println("done Updated");
            else{
                System.out.println("this midicen not in category");
                System.out.println("avelable midicens in category");
                printAllMidiens();
            }
        }
    }
    
    public void deleteMidice(Midicien name){
    if(midicens.isEmpty())System.out.println("is Empty not can delete "+name);
        else{
        boolean isDeleted=false;    
        for(Midicien m:midicens){
            if(m.name.equalsIgnoreCase(name.name)){
                midicens.remove(m);
                isDeleted=true;
                }
            }
            if(isDeleted)
                System.out.println("done Deleted");
            else{
                System.out.println("this midicen not in category");
                System.out.println("avelable midicens in category");
                printAllMidiens();
            }
        }
    }
    public ArrayList<Midicien>getAllMidicens(){
    return midicens;
    }
    
    
    public void printAllMidiens() {
        System.out.println("All midicens in category name:"+this.name);
        for(Midicien m:midicens){
            m.printMidicen();
            System.out.println("============");
        }
    }
    
    public int countOfMidicens(){
    int count=0;
        for(Midicien m:midicens)
            count+=m.getcountMidicen();
        
      System.out.println("count All midicens in category name:"+this.name + " = "+count);
      return count;  
    }
    
    public double totalPriceForAllMidicens(){
        int totalPrice=0;
        for(Midicien m:midicens)
            totalPrice+=m.getPrice();
        
      System.out.println("count All midicens in category name:"+this.name + " = "+totalPrice);
      return totalPrice;
    }
    
    public void clearAllMidicens(){
    midicens.clear();
    }
    
    public Category(String name,ArrayList midicens){
        this.name=name;
        this.midicens=midicens;
    }
    public Category(String name){
        this.name=name;
        this.midicens=new ArrayList();
    }
}
