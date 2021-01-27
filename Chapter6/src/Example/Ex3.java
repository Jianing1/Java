package Example;

import java.awt.Button;

import javax.swing.JFrame;

class MyBorderLayout extends JFrame{
	public MyBorderLayout() {
		super("BorderLayout Example");
		this.setBounds(100,100,500,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().add(new Button("Button_north"),"North");
		this.getContentPane().add(new Button("Button_South"),"South");
		this.getContentPane().add(new Button("Button_west"),"West");
		this.getContentPane().add(new Button("Button_east"),"East");
		this.getContentPane().add(new Button("Button_center"),"Center");
		this.setVisible(true);
	}
	
	
}
public class Ex3 {
	public static void main(String[] args) {
		new MyBorderLayout();
	}
	
}
