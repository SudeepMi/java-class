package com.mycompany.guiswing;

/**
 *
 * @author cws
 */

import javax.swing.*;
import java.awt.event.*;

public class GUISwing {

    public static void main(String[] args) {
        JFrame j = new JFrame();
        JLabel Lab1 = new JLabel("Number 1:");
        Lab1.setBounds(20,20,150,20);
        j.add(Lab1);
        
        JTextField t1 = new JTextField(); 
        t1.setBounds(170,20,100,20);
        j.add(t1);
        
        
        JLabel Lab2 = new JLabel("Number 2:");
        Lab2.setBounds(20,60,150,20);
        j.add(Lab2);
        
        JTextField t2 = new JTextField();
        t2.setBounds(170,60,100,20);
        j.add(t2);
        
        JButton btn = new JButton("ADD");
        btn.setBounds(80,100,100,20);
        j.add(btn);
        
        JLabel res = new JLabel("Result:");
        res.setBounds(80,130,150,20);
        j.add(res);
        
         
        
        j.setTitle("Add Two Number");
        j.setSize(500,500);
        j.setLayout(null);
        j.setVisible(true);
        
        
        class ButtonLis implements ActionListener{
        public void actionPerfromed(ActionEvent e){
            if(e.getSource()== btn){
                int number1 = Integer.parseInt(t1.getText());
                int number2 = Integer.parseInt(t2.getText());
                int sum = number1+number2;
                res.setText(sum);
                
            }
        }
    }
        
        
        
    }
    
    
}
