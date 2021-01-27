package Example;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ItemComponents extends JFrame{
	JComboBox cb_channel;
	JList list_shows;
	JLabel label;
	Object[] channel= {"CCTV 1","CCTV 2"};
	Object[][] shows= {{"1","2"},{"3","4","5"}};
public ItemComponents() {
	// TODO Auto-generated constructor stub
	super("Componnet Example");
	this.setBounds(100,100,250,180);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.getContentPane().setLayout(new FlowLayout());
	cb_channel=new JComboBox(channel);
	this.getContentPane().add(cb_channel);
	list_shows=new JList(shows[0]);
	this.getContentPane().add(list_shows);
	label=new JLabel("");
	this.getContentPane().add(label);
	
	cb_channel.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent e) {
			int i=cb_channel.getSelectedIndex();
			list_shows.setListData(shows[i]);;
		}
	});
	list_shows.addListSelectionListener(new ListSelectionListener() {
		@Override
		public void valueChanged(ListSelectionEvent e) {
			String str=cb_channel.getSelectedItem().toString();
			if(!list_shows.isSelectionEmpty()) {
				str+=" "+list_shows.getSelectedValue();
			}
			label.setText("Your choice is:"+str);
			
			
		}
	});
	this.setVisible(true);
}
	
}
public class Ex10 {
	public static void main(String[] args) {
		new ItemComponents();
	}

}
