/*write a java program to implement swing components namely Button,Labels,Checkboxes,Radio Buttons,JScrollPane
,List and JComboBox to design interactive GUI
Roll no=69
Name=Aayushi Tripathi*/

/*Students Registration form*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register extends JApplet
{	
   String data[]={"pune","mumbai","delhi","Nagpur","Nashik"};
	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.gray);
		c.setForeground(Color.white);
		JLabel l1=new JLabel("First name:");
		JLabel l2=new JLabel("Last name:");
		JLabel l3=new JLabel("subject:");
		JLabel l4=new JLabel("Gender:");
		JLabel l5=new JLabel("Country:");
		JLabel l6=new JLabel("City:");		
		
		
		JTextField j1=new JTextField(10);
		JTextField j2=new JTextField(10);

		JCheckBox c1=new JCheckBox("C lang",true);
		JCheckBox c2=new JCheckBox("C++",false);
		JCheckBox c3=new JCheckBox("Java",false);

		JRadioButton r1=new JRadioButton("Female");
		JRadioButton r2=new JRadioButton("Male");

		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		

		JComboBox jc=new JComboBox();
		jc.addItem("India");
		jc.addItem("America");
		jc.addItem("England");
		jc.addItem("Paris");
		jc.addItem("Germany");
		
		JList jl=new JList(data);

		JButton b1=new JButton("Submit");

		

		c.add(l1);
		c.add(j1);
		c.add(l2);
		c.add(j2);
		c.add(l3);
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(l4);
		c.add(r1);
		c.add(r2);
		c.add(l5);
		c.add(jc);c.add(l6);c.add(jl);c.add(b1);
	}
}
/*
<applet code="Register" width=300 height=150></applet>*/

/*
O/p:
C:\Aayushi>javac Register.java

C:\Aayushi>appletviewer Register.java */



		
	

