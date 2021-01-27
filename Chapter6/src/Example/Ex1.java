package Example;

import java.awt.Color;

import javax.swing.JFrame;

class MyJFrame extends JFrame{
	public MyJFrame() {
		super("Example");
		this.setBounds(100,100,200,100);
		this.getContentPane().setBackground(Color.red);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
public class Ex1 {

	public static void main(String[] args) {
		new MyJFrame();

	}

}
