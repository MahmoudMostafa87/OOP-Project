/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Micro
 */
public class Doctor extends Account implements printTable{
    private boolean havePermision;
    
    public boolean getPermision(){
    return havePermision;
    }
    
    public void setPermision(){
    if(havePermision)havePermision=false;
    else havePermision=true;
    }

    public Doctor(String name, int age, float salary,boolean permision) {
        super(name, age, salary);
        this.havePermision=permision;
    }
    public Doctor(String name, int age, float salary) {
        super(name, age, salary);
        this.havePermision=false;
    }

    @Override
    public void printDateUser() {
        System.out.println("information about us");
        
        System.out.println("name = "+super.getName());
        System.out.println("age = "+ super.getAge());
        System.out.println("salary = "+ super.getSalary());
        System.out.println("permision = "+ this.havePermision);
        System.out.println(this.toString());
    }

    @Override
    public void printOrderUser(){}
    
}
