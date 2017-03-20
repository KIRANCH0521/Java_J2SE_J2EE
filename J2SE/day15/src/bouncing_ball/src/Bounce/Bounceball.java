package Bounce;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bounceball extends JFrame 
{JPanel p1;
Rectangle r1;
	private Thread t=null;
	private int x=10,dx=10;
	private int y=100,dy=10;
	private JPanel p2;
	private JButton b1;
	private JButton b2;
public static void main(String []args){
	Bounceball b=new Bounceball("Bounce Ball Application");
	
}
Bounceball(String title)
{
   super(title);
  
	p1=new MyPanel();

   
	setSize(300, 300);
	getContentPane().setBackground(Color.CYAN);
	add(new JLabel("Bouncing ball"),BorderLayout.NORTH);
	b1=new JButton("start");
	b2=new JButton("stop");
	
	p2=new JPanel(new GridLayout(1, 2, 20, 20));
	p2.add(b1);
	p2.add(b2);
	add(p2,BorderLayout.SOUTH);
	add(p1);
	
	setVisible(true);
	
}


class MyPanel extends JPanel implements Runnable,ActionListener
{
	public MyPanel() {
	
		setBackground(Color.cyan);
		 t=new Thread(this);
		 t.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	String sb=e.getActionCommand().toUpperCase();
	switch (sb) {
	case "START":
		new Thread(this).start();
		
		break;
		
	case "STOP":
		break;

	default:
		break;
	}
		
	}
	int rectx;
	int recty;
	//Rectangle r1;
	Graphics2D g2;
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		setTitle("ghjggjhj");
		 //r1=getBounds();
		
		 g2=(Graphics2D) g;
		g2.setColor(Color.black);
		//rectx=(int)r1.getCenterX();
		//recty=(int)r1.getCenterY();
		//System.out.println("x="+x);
		//System.out.println("y="+y);
		Ellipse2D.Double el=new Ellipse2D.Double(x,y, 10, 10);
		g2.fill(el);
		
		
	}
	public void Createball()
	{
		g2.fill(new Ellipse2D.Double(x,y, 10, 10));
	}
	public void run()
	{
		//Createball();
		boolean flag=true;
		//r1=p1.getBounds();
		/*double minx=r1.getMinX();
		double miny=r1.getMinY();
	double maxx=r1.getMaxX();
	double maxy=r1.getMaxY();
	 System.out.println("mx="+maxx);
	   System.out.println("my="+maxy);
	   System.out.println("mix="+minx);
	   System.out.println("miy="+miny);*/
			
		try{
			while(flag)
			{
				  System.out.println("x="+x);
				   System.out.println("y="+y);
			
			if(y>250)
				{
				dx=10;
				dy=-10;
				}
			 if(x>250)
			{
				dx=-10;
				dy=-10;
			}
					    
	
			 if(x<0)
			{
			dx=10;
			dy=10;
			}
			 if(y<0)
		 {
			 dy=10;
			 dx=-10;
		 }
			 System.out.println("run");
		x=x+dx;
		y=y+dy;
	    repaint();
	    t.sleep(50);
	    System.out.println("x="+x);
	   System.out.println("y="+y);
	    
			
		
	    
	}
		
		
	    
	}
						
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



}
