package shpcart;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
public class DeleteAccount extends JFrame{

	JButton b1,b2;
	JLabel l1,l2,dl1,dl2,dl3,dl4,dl5,dl6,dl7,dl8;
	JPanel p1,p2;
	JTextField t1;
	JPasswordField pass;
	
		public DeleteAccount (String s)
		{
			super(s);
			setSize(300, 300);
			setLocationRelativeTo(null);
			getContentPane().setBackground(Color.CYAN);
			b1=new JButton("Submit");
			b2=new JButton("Reset");
			l1=new JLabel("Enter Id");
			l2=new JLabel("Enter Password");
			dl1=new JLabel();
			dl2=new JLabel();
			dl3=new JLabel();
			dl4=new JLabel();
			dl5=new JLabel();
			dl6=new JLabel();
			dl7=new JLabel();
			dl8=new JLabel();
			pass=new JPasswordField(20);
			t1=new JTextField(20);
			p1= new JPanel(new GridLayout(1, 2, 20, 20));
			p2=new JPanel(new GridLayout(6,2,20,20));
			p1.add(b1);
			p1.add(b2);
			p2.add(l1);
			p2.add(t1);
			p2.add(l2);
			p2.add(pass);
			p2.add(dl1);
			p2.add(dl2);
			p2.add(dl3);
			p2.add(dl4);
			p2.add(dl5);
			p2.add(dl6);
			p2.add(dl7);
			p2.add(dl8);
			
			add(p1,BorderLayout.SOUTH);
			add(p2);
			setVisible(true);
			
		}
	

}
