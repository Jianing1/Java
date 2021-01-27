package Homework;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class GirdLayout extends JFrame {
	public GirdLayout() {
		// TODO Auto-generated constructor stub
		super("Demo");
		this.setBounds(100, 100, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(2, 3));
		this.add(new JButton("1"));
		JPanel jp1 = new JPanel(new GridLayout(2, 1));
		jp1.add(new JButton("3"));
		jp1.add(new JButton("4"));
		this.add(jp1);
		this.add(new JButton("2"));
		this.add(new JButton("5"));
		JPanel jp5 = new JPanel(new GridLayout(2, 2));
		jp5.add(new JButton("7"));
		jp5.add(new JButton("8"));
		jp5.add(new JButton("9"));
		jp5.add(new JButton("10"));
		this.add(jp5);
		this.add(new JButton("6"));
		this.setVisible(true);
	}
}

public class PPTDemo2 {
	public static void main(String[] args) {
		new GirdLayout();
	}
}
