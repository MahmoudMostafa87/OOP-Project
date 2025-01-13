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
public class WareHouse {
private ArrayList<Category>category;
private ArrayList<Doctor>DoctorHavePermision;

    
public WareHouse(ArrayList<Doctor> doctor,ArrayList<Category> category){
this.DoctorHavePermision=doctor;
this.category=category;
}
public WareHouse(){
this.DoctorHavePermision=new ArrayList();
this.category=new ArrayList();
}

// if have permission will show it in array i have not to loop on Array of Doctors
public boolean checkDoctorHavePermision(Doctor name){
    if(DoctorHavePermision.isEmpty())System.out.println("not found any doctor");
    else
        for(Doctor d:DoctorHavePermision)
            if(d.equals(name))return true;    
    
    return false;
}

//add doctor to array
public void setDoctorHavePermision(Doctor name){
    if(DoctorHavePermision.isEmpty())System.out.println("not found any doctor");
    else{
    boolean isFoundIt=false;    
        for(Doctor d:DoctorHavePermision)
            if(d.equals(name)){
                isFoundIt=true;
                break;
            }
    if(isFoundIt)System.out.println("he is already have permission not need add it or give him permission");
    else {
        if(!name.getPermision())
                name.setPermision();
        DoctorHavePermision.add(name);
        }
    }
}

public void deleteDoctor(Doctor name){
DoctorHavePermision.remove(name);
name.setPermision();
}

public ArrayList<Doctor> getAllDoctorHavePermision(){
return DoctorHavePermision;
}

public void printDoctorHavePermision(){
if(DoctorHavePermision.isEmpty())System.out.println("not Exist any doctor have permission");
else
   for(Doctor d:DoctorHavePermision)
        d.printDateUser(); 
}

public long getCountMidicen(){
    long count=0;
    if(category.isEmpty())System.out.println("not found category");
    else{
       for(Category c:category){   
       if(c.getAllMidicens().isEmpty())System.out.println("not have any midicen here");
       else count+=c.countOfMidicens();
      }
    }
    return count;
}

public void setCountMidicen(int number,Midicien name){
    for(Category c:category){
        if(c.getAllMidicens().isEmpty())System.out.println("this category is Empty");
        else
            for(Midicien m:c.getAllMidicens())
                if(m.name.equalsIgnoreCase(name.name))m.addAmountFromMidicen(number);
            
    }
}

public ArrayList<Category> getAllCategory(){
    return category;
}

public void setCategory(Category name,Category newCategory){
    if(category.isEmpty())System.out.println("ware House not have any category");
    else{
    boolean isUpdated=false;
        for(Category c:category){
        if(c.name.equalsIgnoreCase(name.name)){
            category.remove(c);
            category.add(newCategory);
            isUpdated=true;
            }
        }
       if(isUpdated)System.out.println("done Updated");
       else System.out.println("not found this category");
    }
}

public void setCategory(Category name){
    if(category.isEmpty())category.add(name);
    else{
        boolean isFoundIt=false;
        for(Category c:category)
            if(c.name.equalsIgnoreCase(name.name)){
                isFoundIt=true;
                break;
            }
        
       if(isFoundIt)System.out.println("not can add this Category is here already");
       else category.add(name);
    }
}

public void deleteCategory(Category name){
    if(category.isEmpty())System.out.println("ware House not have any category");
    else{
    boolean isDeleted=false;
        for(Category c:category){
        if(c.name.equalsIgnoreCase(name.name)){
            category.remove(c);
            isDeleted=true;
        }
        }
       if(isDeleted)System.out.println("done Deleted");
       else System.out.println("not found this category");
    }
}

public double getTotalPriceForAllMidicens(){
        double totalPrice=0;
    if(category.isEmpty())System.out.println("not found category");
    else{
       for(Category c:category){   
       if(c.getAllMidicens().isEmpty())System.out.println("not have any midicen here");
       else totalPrice+=c.totalPriceForAllMidicens();
      }
    }
    return totalPrice;
 }

    public void clearAllDoctor(){
        DoctorHavePermision.clear();
    }

    public void clearAllCategory(){
        category.clear();
    }

    public void clear(){
        DoctorHavePermision.clear();
        category.clear();
    }
}
