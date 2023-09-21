/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import newpackage.NewClass;

/**
 *
 * @author cws
 */
class Mavenproject1 extends NewClass{
    
    public static void main(String args[]){ 
         Mavenproject1 u = new Mavenproject1();
//        MathClass u = new MathClass();
//        NewClass u = new NewClass();
        int a = u.mul(2, 4);
        int b = u.mul(3,4,8);
        double c = u.mul(2, 1.3);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        
        OuterClass i = new OuterClass();
        
    }  
}  


class util{
    public int mul(int a, int b){
        return a*b;
    }
    
    protected int mul(int a, int b, int c){
        return a*b*c;
    }
    
    public double mul(int a, double b){
        return a*b;
    }
}

class MathClass extends util {
    @Override
    public double mul(int a, double b){
        return a*b*3;
    }
}


class OuterClass{
    class InnerClass{
        public void print_(){
            System.out.println("Helloooooo");
        }
    }
}

