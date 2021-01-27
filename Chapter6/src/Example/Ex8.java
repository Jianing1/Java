package Example;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class MyJFrame3 extends JFrame{
	public MyJFrame3() {
		super("Simple Example");
		this.setBounds(100,100,200,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=this.getContentPane();
		c.addMouseListener(new MyMouseListener2(c));
		this.setVisible(true);		
	}
}
class MyMouseListener2 extends MouseAdapter{
	Container c;
	public MyMouseListener2(Container c) {
		this.c=c;
	}
	public void mouseEntered(MouseEvent e) {
		c.setBackground(Color.red);
	}
	public void mouseExited(MouseEvent e) {
		c.setBackground(Color.white);
	}
}
public class Ex8 {
	public static void main(String[] args) {
		new MyJFrame3();
	}
}
