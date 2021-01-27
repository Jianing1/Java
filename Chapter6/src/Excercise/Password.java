package Excercise;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Text extends JFrame{
	public Text() {
		// TODO Auto-generated constructor stub
		super("Demo");
		this.setBounds(100, 100, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(new Label("user"));
		this.add(new JTextField(20));
		this.add(new Label("password"));
		this.add(new JPasswordField(20));
		this.add(new JTextField("desciption"));
		this.add(new JTextArea("1",5,20));
		this.setVisible(true);
	}

}
public class Password {
public static void main(String[] args) {
	new Text();
}
}
