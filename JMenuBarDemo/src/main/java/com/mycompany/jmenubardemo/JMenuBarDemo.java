/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jmenubardemo;

/**
 *
 * @author cws
 */

import javax.swing.*;

import java.awt.event.*;

/**
 *
 * @author cws
 */
public class JMenuBarDemo {

    public static void main(String[] args) {
         JFrame j = new JFrame();
         JMenuBar menubar = new JMenuBar();
         JMenu menu = new JMenu("File");
         JMenu sbmenu = new JMenu("View");
         JMenuItem i1,i2,i3,i4;
        

         i1 = new JMenuItem("Open");
         i2 = new JMenuItem("Close");
         i3 = new JMenu("Recent");
         i4 = new JMenuItem("Hello.txt");
         i3.add(i4);
         menu.add(i1);
         menu.add(i2);
         menu.add(i3);
         
         menubar.add(menu);
         menubar.add(sbmenu);
         j.setJMenuBar(menubar);

         i2.addActionListener((ActionEvent e) -> {
             Object[] options = {"Yes","No"};
             int ret = JOptionPane.showOptionDialog(j, "Message", "Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
         });
         
         
         String[][] data = {
            { "Kundan Jha", "4031", "CSE" },
            { "Anand Jha", "6014", "IT" }
        };
 
        // Column Names
        String[] columnNames = { "Name", "Roll Number", "Department" };
 
        // Initializing the JTable
        JTable t = new JTable(data, columnNames);
        
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(t);
        j.add(sp);
        j.setTitle("JMenu Demo");
        j.setSize(500,500);
        j.setLayout(null);
        j.setVisible(true);
   
    }
}
