package Example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class WindowRectangel extends JFrame implements ActionListener {
	JTextField tf_width, tf_length;
	JButton btn_area;
	JTextArea text;
	Rectangle r;

	public WindowRectangel() {
		r = new Rectangle();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		p1.add(new JLabel("length"));
		tf_length = new JTextField(5);
		p1.add(tf_length);
		p1.add(new JLabel("width"));
		tf_width=new JTextField(5);
		p1.add(tf_width);
		btn_area = new JButton("calculate area");
		btn_area.addActionListener(this);
		p1.add(btn_area);
		this.getContentPane().add(p1, "North");
		text = new JTextArea(5, 20);
		this.getContentPane().add(text);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int length = Integer.parseInt(tf_length.getText());
			int width = Integer.parseInt(tf_width.getText());
			r.setLength(length);
			r.setWidth(width);
			if (r.isSquare()) {
				text.append("Square's length:" + length + ",Square is" + r.area() + "\n");
			} else
				text.append("Changfangxing's length:" + length + "kuan: " + width + ",mianji:" + r.area() + "\n");
		} catch (Exception e2) {
			text.append("cannot calculate the square" + e2.toString() + "\n");// TODO: handle exception
		}
	}
}

class Rectangle {
	private int length;
	private int width;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isSquare() {
		return width == length ? true : false;
	}

	public int area() {
		return width * length;
	}
}

public class Ex14 {
public static void main(String[] args) {
	WindowRectangel win=new WindowRectangel();
	win.setTitle("Use MVC structure to calculate the square");
	win.setBounds(100,100,400,200);
}
}
