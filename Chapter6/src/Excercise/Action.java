package Excercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

class MyJFrame extends JFrame {
	public MyJFrame() {
		// TODO Auto-generated constructor stub
		super("事件监听器接口例子");
		this.setBounds(100, 100, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.addMouseListener(new MyMouseListener(c));
		this.setVisible(true);
	}
}

class MyMouseListener implements MouseListener {
	Container c;

	public MyMouseListener(Container c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		c.setBackground(Color.BLUE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		c.setBackground(Color.RED);
	}

}

public class Action {
	public static void main(String[] args) {
		new MyJFrame();
	}
}
