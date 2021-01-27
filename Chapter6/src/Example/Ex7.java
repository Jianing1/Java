package Example;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

class MyJFrame2 extends JFrame{
	public MyJFrame2() {
		super("JFrame Example");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=this.getContentPane();
		c.addMouseListener(new MyMouseListener(c));
		this.setVisible(true);
		
	}
}
class MyMouseListener implements MouseListener{
	Container c;
	public MyMouseListener(Container c) {
		this.c=c;
	}
	public void mouseEntered(MouseEvent e) {
		c.setBackground(Color.red);
	}
	public void mouseExited(MouseEvent e) {
		c.setBackground(Color.white);		
	}
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Ex7 {

	public static void main(String[] args) {
		new MyJFrame2();

	}

}
