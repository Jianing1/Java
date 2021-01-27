package Example;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFlowLayout extends JFrame{
	public MyFlowLayout() {
		super("FlowLayout Example");
		this.setBounds(100,100,300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(new JButton("button1"));
		this.getContentPane().add(new JButton("button2"));
		this.getContentPane().add(new JButton("button3"));
		this.setVisible(true);
	}
}
public class Ex2 {

	public static void main(String[] args) {
		new MyFlowLayout();

	}

}
