package swing_frms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonFrameSimplified extends JFrame implements ActionListener {

	
	private JButton b1, b2, b3;
	private JPanel p2;

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new ButtonFrameSimplified("Testing Buttons + Events");

	}

	public ButtonFrameSimplified(String title) {
		super(title);
		setSize(400, 200);
		setLocationRelativeTo(null);// setLocation(..)
		p2 = new JPanel();
		b1 = new JButton("RED");

		// attach listener to the btn source
		b1.addActionListener(this);
		b1.setBackground(Color.RED);
		b2 = new JButton("GREEN");
		b2.addActionListener(this);
		b3 = new JButton("BLUE");
		b3.addActionListener(this);
		// create empty panel with def. layout mgr. --- def constr.
		// JPanel p1=new JPanel(new GridLayout(1,3,30,10));
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 50, 10));
		p1.setBackground(Color.GRAY);
		// add comps to panel
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		// add panel to south region of frame
		add(p1, BorderLayout.SOUTH);
		// create another Panel

		// adding empty panel to center.
		p2.setBackground(Color.CYAN);
		add(p2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("in action ");

		Color c = null;
		Colors c1 = Colors.valueOf(e.getActionCommand());
		switch (c1) {
		case RED:
			c = Color.RED;
			break;
		case GREEN:
			c = Color.GREEN;
			break;
		case BLUE:
			c = Color.BLUE;
			break;

		}
		p2.setBackground(c);

	}

}