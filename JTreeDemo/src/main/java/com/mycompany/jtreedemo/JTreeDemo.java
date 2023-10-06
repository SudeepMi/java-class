/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jtreedemo;
import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class JTreeDemo {  
JFrame f;  
JTreeDemo(){  
    f=new JFrame();   
    DefaultMutableTreeNode style=new DefaultMutableTreeNode("College");  
    DefaultMutableTreeNode teacher=new DefaultMutableTreeNode("teacher");  
    DefaultMutableTreeNode student=new DefaultMutableTreeNode("student");  
    style.add(teacher);  
    style.add(student);  
    DefaultMutableTreeNode red=new DefaultMutableTreeNode("ram");  
    DefaultMutableTreeNode blue=new DefaultMutableTreeNode("hari");  
    DefaultMutableTreeNode black=new DefaultMutableTreeNode("sita");  
    DefaultMutableTreeNode green=new DefaultMutableTreeNode("gita");
    DefaultMutableTreeNode detials=new DefaultMutableTreeNode("Hello");
    red.add(detials);
    teacher.add(red); 
    teacher.add(blue); 
    student.add(black); 
    student.add(green);      
    JTree jt=new JTree(style);  
    f.add(jt);  
    f.setSize(400,400);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new JTreeDemo();  
}}  