package Example;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class TextCompontents extends JFrame{
	public TextCompontents() {
		super("TextComponent Example");
		this.setBounds(100,100,310,220);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.getContentPane().add(new JLabel("user"));
		this.getContentPane().add(new JTextField(20));
		this.getContentPane().add(new JLabel("password"));
		this.getContentPane().add(new JPasswordField(20));
		this.getContentPane().add(new JLabel("description"));
		this.getContentPane().add(new JTextArea("My information:",5,20));
		this.setVisible(true);
	}
	
	
}
public class Ex5 {
	public static void main(String[] args) {
		new TextCompontents();
	}

}
