/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.time.LocalDate;

/**
 *
 * @author Micro
 */

public class Midicien implements DisCount{
   public String name;
   public LocalDate dateToEnd; 
   private float price;
   static Category categore;
   private String painted;
   private String paintedSide;
   private int countMidicen;
   
   
   public float getPrice(){return price;}
   public void setPrice(float price){this.price=price;}
   public String timesTakeIt(){
    if(countMidicen==0)System.out.println("not can take it");
    else countMidicen--;
      return name;
   }
   
   static Category getCategory(){
   return categore;
   }
   
   static void setCategory(Category cat){
       categore=cat;
   }
   
   public String getPaint(){
   return painted;
   }
   
   public void setPaint(String paint){
       painted=paint;
   }
   
   public String getPaintSide(){
   return paintedSide;
   }
   
   public void setPaintSide(String paintSide){
       paintedSide=paintSide;
   }
   
   public int getcountMidicen(){
   return countMidicen;
   }
   
   public void addAmountFromMidicen(int count){
       if(count<0){
           System.out.println("enter data right");
           return;
       }
       countMidicen+=count;
   }
   
    @Override
    public float disCountOrder(int discount) {
        return price*discount/100 ;
    }
    
    
    public void printMidicen(){
    System.out.println("name = "+this.name);
    System.out.println("price = "+this.price);
    System.out.println("date to End = "+this.dateToEnd);
    System.out.println("painted = "+this.painted);
    System.out.println("painted side = "+this.paintedSide);
    System.out.println("count = "+this.countMidicen);
    }
   
   public Midicien(String name,float price,Category category,String painted,String paintedSide,LocalDate date,int count){
        this.name=name;
        this.price=price;
        this.categore=category;
        this.painted=painted;
        this.paintedSide=paintedSide;
        this.dateToEnd=date;
        this.countMidicen=count;
   }
   

}
