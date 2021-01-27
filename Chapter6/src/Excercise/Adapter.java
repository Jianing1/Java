package Excercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class MyJFrame1 extends JFrame {
	public MyJFrame1() {
		// TODO Auto-generated constructor stub
		super("事件监听器接口例子");
		this.setBounds(100, 100, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.addMouseListener(new MyMouseListener(c));
		this.setVisible(true);
	}
}

class MyMouseAdapter extends MouseAdapter {
	Container c;

	public MyMouseAdapter(Container c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		c.setBackground(Color.RED);
		super.mouseEntered(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		c.setBackground(Color.BLUE);
		super.mouseExited(e);
	}
}

public class Adapter {
	public static void main(String[] args) {
		new MyJFrame1();
	}
}
