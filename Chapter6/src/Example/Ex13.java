package Example;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextJFrame13();
	}

}
class TextJFrame13 extends JFrame {
	private JFrame jf;
	private JTextArea text;
	private JComboBox jcb;
	private JCheckBox check_bold,check_italic;
	private JRadioButton radio_red,radio_green,radio_blue;
	
	public TextJFrame13() {
		jf = new JFrame("Text Editor");
		jf.setBounds(200,200,400,400);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JMenuBar menubar = new JMenuBar();
		
		jf.setJMenuBar(menubar);
		String str[] = {"file","edit","help"};
	    JMenu menu[] = new JMenu[str.length];
	    for(int i=0;i<str.length;i++) {
	    	
	    	menu[i] = new JMenu(str[i]);
	    	
	    	menubar.add(menu[i]);
	    }
	    text = new JTextArea("Example");
	    jf.getContentPane().add(text);
	 
	    JToolBar toolbar = new JToolBar();

	    toolbar.setLayout(new FlowLayout());
	
	    jf.getContentPane().add(toolbar,"North");
	    jcb = new JComboBox();
	    jcb.setEditable(true);
	    toolbar.add(jcb);
	    String[]str_size = {"20","30","40","50","60"};
	    String str_file[] = {"open","save","exit"};
	    JMenuItem menuitem[] = new JMenuItem[str_file.length];
	    for(int j=0; j<str_file.length; j++) {
	    	menuitem[j] = new JMenuItem(str_file[j]);
	    	menu[0].add(menuitem[j]);
	    	
	    	menu[0].addSeparator();
	    	menuitem[j].addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			
	    			if(e.getSource() instanceof JMenuItem) {
	    				if(e.getActionCommand() == "exit") {
	    					if(JOptionPane.showConfirmDialog(jf, "you confirm to exit") == 0);
	    						System.exit(0);
	    				}
	    			}
	    		}
	    	});
	    }
	    check_bold = new JCheckBox("bold");
	    check_italic = new JCheckBox("xieti");
	    toolbar.add(check_bold);
	    toolbar.add(check_italic);
	    check_bold.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(e.getSource() instanceof JCheckBox) {
	    			if(e.getActionCommand() == "bold") {
	    				Font f = text.getFont();
	    				text.setFont(new Font(f.getFontName(),Font.BOLD,f.getSize()));
	    			}
	    		}
	    	}
	    });
	    check_italic.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(e.getSource() instanceof JCheckBox) {
	    			if(e.getActionCommand() == "xieti") {
	    				Font f = text.getFont();
	    				text.setFont(new Font(f.getFontName(),Font.ITALIC,f.getSize()));
	    			}
	    		}
	    	}
	    });
	    radio_red = new JRadioButton("red");
	    radio_green = new JRadioButton("green");
	    radio_blue = new JRadioButton("blue");
	    ButtonGroup bg = new ButtonGroup();
	    bg.add(radio_red);
	    bg.add(radio_green);
	    bg.add(radio_blue);
	    toolbar.add(radio_red);
	    toolbar.add(radio_green);
	    toolbar.add(radio_blue);
	    radio_red.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		if(e.getSource() instanceof JRadioButton) {
	    			if(e.getActionCommand() == "red") {
	    				text.setForeground(Color.red);
	    			}
	    		}
	    	}
	    });
	    radio_green.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		if(e.getSource() instanceof JRadioButton) {
	    			if(e.getActionCommand() == "green") {
	    				text.setForeground(Color.green);
	    			}
	    		}
	    	}
	    });
	    radio_blue.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		if(e.getSource() instanceof JRadioButton) {
	    			if(e.getActionCommand() == "blue") {
	    				text.setForeground(Color.blue);
	    			}
	    		}
	    	}
	    });
	    JPopupMenu popmenu = new JPopupMenu();
	    
	    String popstr[] = {"ctrl x","ctrl c","ctrl v"};
	    JMenuItem popmenuitem[] = new JMenuItem[popstr.length];
	    for(int i=0; i<popstr.length; i++) {
	    	popmenuitem[i] = new JMenuItem(popstr[i]);
	    	popmenu.add(popmenuitem[i]);
	    	popmenuitem[i].addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			
	    			if(e.getSource() instanceof JMenuItem) {
	    				if(e.getActionCommand() == "ctrl c")
	    					text.copy();
	    				if(e.getActionCommand() == "ctrl v")
	    					text.paste();
	    				if(e.getActionCommand() == "ctrl x")
	    					text.cut();
	    			}
	    		}
	    	});
	    }
	 
	    text.add(popmenu);
	    text.addMouseListener(new MouseListener() {
	    	public void mouseClicked(MouseEvent e) {
	    		
	    		if(e.getModifiers() == MouseEvent.BUTTON3_MASK)
	    			
	    			popmenu.show(text,e.getX(),e.getY());
	    	}
	    	public void mouseEntered(MouseEvent e) {}
	    	public void mouseExited(MouseEvent e) {}
	    	public void mousePressed(MouseEvent e) {}
	    	public void mouseReleased(MouseEvent e) {}
	    });
	    for(int i=0; i<str_size.length; i++) {
	    	jcb.addItem(str_size[i]);
	    	jcb.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			
	    			if(e.getSource() instanceof JComboBox) {
	    				Font f = text.getFont();
	    				try {
	    					int i=Integer.parseInt((String) jcb.getSelectedItem());
	    					
	    					text.setFont(new Font(f.getFontName(),f.getStyle(),i));
	    				}catch(Exception ex) { 
	    					JOptionPane.showMessageDialog(jf, "please input again");
	    					jcb.setSelectedItem(String.valueOf(f.getSize()));
	    				}
	    				
	    				String size = (String) jcb.getSelectedItem();
	    				
	    				int i=0,n=jcb.getItemCount();
	    				
	    				while(i<n && size.compareTo((String) jcb.getItemAt(i))>=0) {
	    					if(size.compareTo((String) jcb.getItemAt(i)) == 0)
	    						return;
	    					i++;
	    				}
	    				
	    				jcb.insertItemAt(size, i);
	    			}
	    		}
	    	});
	    }
	}
}








