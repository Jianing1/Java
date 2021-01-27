package Example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

class DialogDemo extends JFrame{
	private JButton btn;
	private MyDialog dialog;
	public DialogDemo() {
		super("Dialog Example");
		this.setBounds(100,100,200,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn=new JButton("Open Dialog");
		this.getContentPane().add(btn);
		dialog=new MyDialog(this);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn) {
					dialog.setVisible(true);
				}
				// TODO Auto-generated method stub
				
			}
		});
		this.setVisible(true);
		// TODO Auto-generated constructor stub
	}
	class MyDialog extends JDialog{
		public MyDialog(JFrame jframe) {
			super(jframe,"My dialog",true);
			this.setBounds(jframe.getX()+jframe.getWidth()+10,jframe.getY(),150,150);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.getContentPane().setLayout(new FlowLayout());
			this.getContentPane().add(new JButton("study"));
			this.getContentPane().add(new JButton("rest"));
			// TODO Auto-generated constructor stub
		}
	}
}

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new DialogDemo();
	}

}
