package Example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

class PopupMenuDemo extends JFrame{
	private JTextArea text;
	private JPopupMenu popmenu;
	public PopupMenuDemo() {
		super("Menu Example");
		this.setBounds(100,100,200,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.text=new JTextArea("I am a Chinese");
		this.popmenu=new JPopupMenu();
		String popstr[]= {"ctrl x","ctrl c","ctrl v"};
		JMenuItem popmenuitthis[]=new JMenuItem[popstr.length];
		MyActionListener3 mal=new MyActionListener3(text);
		for(int i=0;i<popstr.length;i++) {
			popmenuitthis[i]=new JMenuItem(popstr[i]);
			this.popmenu.add(popmenuitthis[i]);
			popmenuitthis[i].addActionListener(mal);
		}
		this.text.add(this.popmenu);
		MyMouseListener5 mml=new MyMouseListener5(text,popmenu);
		this.text.addMouseListener(mml);
		this.setVisible(true);
		// TODO Auto-generated constructor stub
	}
}
class MyActionListener3 implements ActionListener{
	private JTextArea text;
	public MyActionListener3(JTextArea text) {
		this.text=text;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="ctrl c")
			text.copy();
		if(e.getActionCommand()=="ctrl v")
			text.paste();
		if(e.getActionCommand()=="ctrl x")
			text.cut();
		// TODO Auto-generated method stub
		
	}
}
class MyMouseListener5 implements MouseListener{
	private JTextArea text;
	private JPopupMenu popmenu;
	public MyMouseListener5(JTextArea text,JPopupMenu popmenu) {
		this.text=text;
		this.popmenu=popmenu;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getModifiers()==MouseEvent.BUTTON3_MASK)
			popmenu.show(text,e.getX(),e.getY());
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class Ex12 {

	public static void main(String[] args) {
		new PopupMenuDemo();
		// TODO Auto-generated method stub

	}

}
