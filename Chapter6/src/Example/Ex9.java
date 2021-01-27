  package Example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ButtonComponents extends JFrame implements ActionListener{
	JTextArea text;
	JButton btn_ok;
	JTextField text_name;
	JRadioButton rb[];
	JCheckBox cb[];
	String str="";
	public ButtonComponents() {
		super("Components Example");
		String []sex={"male","female"};
		String []hobbies= {"sport","music"};
		this.setBounds(100,100,300,180);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		text=new JTextArea(5,10);
		this.getContentPane().add(text,"West");
		JPanel panel=new JPanel(new FlowLayout());
		this.getContentPane().add(panel);
		panel.add(new JLabel("name:"));
		text_name=new JTextField(12);
		panel.add(text_name);
		panel.add(new JLabel("sex:"));
		ButtonGroup bg=new ButtonGroup();
		rb=new JRadioButton[sex.length];
		for(int i=0;i<sex.length;i++) {
			rb[i]=new JRadioButton(sex[i]);
			bg.add(rb[i]);
			panel.add(rb[i]);
		}
		panel.add(new JLabel("hobbies:"));
		cb=new JCheckBox[hobbies.length];
		for(int i=0;i<hobbies.length;i++) {
			cb[i]=new JCheckBox(hobbies[i]);
			panel.add(cb[i]);
		}
		btn_ok=new JButton("ok");
		btn_ok.addActionListener((ActionListener) this);
		panel.add(btn_ok);
		this.setVisible(true);
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn_ok) {
				str+="name:\n"+text_name.getText()+"\n sex:\n";
				for(int i=0;i<rb.length;i++) {
					if(rb[i].isSelected())
						str+=rb[i].getText();
					str+="\n hobbies: ";
					for(int i0;i<cb.length;i++) {
						if(cb[i].isSelected())
							str+="\n"+cb[i].getText();
					}
				}
			}
		
	}
}
public class Ex9 {

	public static void main(String[] args) {
		
new ButtonComponents();
	}

}
