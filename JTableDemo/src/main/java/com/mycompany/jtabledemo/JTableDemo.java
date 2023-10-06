
package com.mycompany.jtabledemo;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo {
	JFrame f;
	JTable j;

	JTableDemo()
	{
		f = new JFrame();
		f.setTitle("JTable Example");
		String[][] data = {
			{ "Sudeep  Mishra", "4031", "CSE" },
			{ "Anand Mishra", "6014", "IT" }
		};

		String[] columnNames = { "Name", "Roll Number", "Department" };
		j = new JTable(data, columnNames);
		j.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(j);
		f.add(sp);
		f.setSize(500, 200);
		f.setVisible(true);
	}

	// Driver method
	public static void main(String[] args)
	{
		new JTableDemo();
	}
}
