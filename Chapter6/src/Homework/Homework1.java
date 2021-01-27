package Homework;

import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class MyBorderLayout extends JFrame {
	public MyBorderLayout() {
		super("Example");
		this.setBounds(100, 100, 500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Button b1 = new Button("button1");
		Button b2 = new Button("button2");
		this.getContentPane().add(b1, "North");
		this.getContentPane().add(b2, "South");

		this.setVisible(true);
		b1.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				b1.setVisible(false);
				b2.setVisible(true);

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		b2.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				b2.setVisible(false);
				b1.setVisible(true);
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
//		b1.setVisible(true);
//		b1.setVisible(true);
	}
	
}

public class Homework1 {

	public static void main(String[] args) {
		new MyBorderLayout();
	}

}
