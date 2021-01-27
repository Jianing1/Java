package Example;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyGridLayout extends JFrame{
	MyGridLayout(){
		super("GridLayout Example");
		this.setBounds(100,100,300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(3,1));
		this.getContentPane().add(new Button("Button1"));
		JPanel jp=new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(new Button("Button2"));
		jp.add(new Button("Button3"));
		this.getContentPane().add(jp);
		this.getContentPane().add(new Button("Button4"));
		this.setVisible(true);
	}
}
public class Ex4 {
	public static void main(String[] args) {
		new MyGridLayout();
	}

}
