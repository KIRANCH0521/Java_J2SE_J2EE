package shpcart;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Jframeshpcart extends JFrame implements ActionListener{

	JPanel p1,p2;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3,t4;
	
	
	public Jframeshpcart(String title)
	{
		super(title);
		 setSize(400,400);
		 setLocationRelativeTo(null);
		 getContentPane().setBackground(Color.CYAN);
		 b1=new JButton("Signup");
		 b2=new JButton("Login");
		 b3=new JButton("Unregister");
		 b4=new JButton("Display");
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
		 p1=new JPanel(new GridLayout(2,2,10,25));
		 p1.add(b1);
		 p1.add(b2);
		 p1.add(b3);
		 p1.add(b4);
		 
		 t1=new JTextField("Press Signup for Registering ");
		 t1.setEditable(false);
		 t1.setFont(new Font("Verdana",Font.ITALIC,15));
		 t1.setForeground(Color.BLUE);
		 //add(t1,BorderLayout.NORTH);
		 t2=new JTextField(" Press Login for Shoping");
		 t2.setEditable(false);
		 t2.setFont(new Font("Verdana",Font.ITALIC,15));
		 t2.setForeground(Color.BLUE);
		 //add(t2,BorderLayout.NORTH);
		 t3=new JTextField(" Press Unregister for Deleting Your Account ");
		 t3.setEditable(false);
		 t3.setFont(new Font("Verdana",Font.ITALIC,15));
		 t3.setForeground(Color.BLUE);
		 //add(t3,BorderLayout.NORTH);
		 t4=new JTextField("Press Display for viewing all Registerd Users");
		 t4.setEditable(false);
		 t4.setFont(new Font("Verdana",Font.ITALIC,15));
		 t4.setForeground(Color.BLUE);
		 //add(t4,BorderLayout.NORTH);
		 p2=new JPanel(new GridLayout(4,0,40,10));
		 p2.add(t1);
		 p2.add(t2);
		 p2.add(t3);
		 p2.add(t4);
		 add(p2);
		 add(p1,BorderLayout.SOUTH);
		 setVisible(true);
	}
	
	
	public static void main(String[] args) {
new Jframeshpcart("BOOK-SHOP");

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
			String s1=e.getActionCommand().toUpperCase();
			
			switch(s1)
			{
			case "SIGNUP":
							Jframesignup sin =new Jframesignup("THIS IS MY SIGN UP PAGE");
							
						break;
						
			case "LOGIN":
							break;
						
			case "DISPLAY": 
			
								break;
								
			case "UNREGISTER":
				DeleteAccount da=new DeleteAccount("THIS IS FOR DELETING YoUR PAGE");
								break;
			}	
		
	}

}
