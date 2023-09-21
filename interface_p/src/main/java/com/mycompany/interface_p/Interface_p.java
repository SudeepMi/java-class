/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface_p;

/**
 *
 * @author cws
 */
public class Interface_p {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        NewStudent s = new NewStudent();
        s.setName();
        System.out.println(s.getName());
        
        try{
            int arr[] = {3,5,6};
             System.out.println(arr[10]);
            if(arr[0]==3){
                throw new ArithmeticException("Hello from throw");
            }
           
            
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
             System.out.println(e.getMessage());
        }
        
    }
}


interface Student{
   
    public String getName();
    public void setName();
}

class NewStudent implements Student{
    public String name;
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = "sudeep";
    }
    
}

// exception handling, inheritance 