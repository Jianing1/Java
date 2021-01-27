package Homework;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyGirdLayout extends JFrame {
	public MyGirdLayout() {
		super("Gird Example");
		this.setBounds(100, 100, 300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(2, 1));
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		JPanel jp2 = new JPanel();
		jp2.setLayout(new BorderLayout());
		jp2.add(new JButton("Button3"),"North");
		jp2.add(new JButton("Button4"),"South");
		jp1.add(new JButton("Button1"));
		jp1.add(jp2);
		jp1.add(new Button("Button2"));
		JPanel jp3 = new JPanel();
		jp3.setLayout(new FlowLayout());
		jp3.add(new Button("Button5"));
		JPanel jp4 = new JPanel();
		jp4.setLayout(new GridLayout(2,2));
		jp4.add(new Button("Button7"));
		jp4.add(new Button("Button8"));
		jp4.add(new Button("Button9"));
		jp4.add(new Button("Button10"));
		jp3.add(jp4);
		jp3.add(new Button("Button6"));
		this.add(jp1);
		this.add(jp3);
		this.setVisible(true);
		// TODO Auto-generated constructor stub
	}
}

public class PPTDemo {

	public static void main(String[] args) {

		new MyGirdLayout();
	}

}
