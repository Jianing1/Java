package Example;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

class MenuDemo extends JFrame {
	public MenuDemo() {
		super("Menu Demo");
		this.setBounds(100, 100, 200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar();
		this.setJMenuBar(menubar);
		JMenu menu_file = new JMenu("File");
		JMenu menu_help = new JMenu("Help");
		menubar.add(menu_file);
		menubar.add(menu_help);
		JMenuItem mi1 = new JMenuItem("Open");
		JMenuItem mi2 = new JMenuItem("Save");
		JMenuItem mi3 = new JMenuItem("Close");
		JCheckBoxMenuItem mi4 = new JCheckBoxMenuItem("Tool 1");
		JCheckBoxMenuItem mi5 = new JCheckBoxMenuItem("Tool 2");
		JRadioButtonMenuItem mi6 = new JRadioButtonMenuItem("Fomate 1");
		JRadioButtonMenuItem mi7 = new JRadioButtonMenuItem("Fomate 2");
		ButtonGroup bg = new ButtonGroup();
		bg.add(mi6);
		bg.add(mi7);
		menu_file.add(mi1);
		menu_file.add(mi2);
		menu_file.add(mi3);
		menu_file.addSeparator();
		menu_file.add(mi4);
		menu_file.add(mi5);
		menu_file.addSeparator();
		menu_file.add(mi6);
		menu_file.add(mi7);
		this.setVisible(true);
	}

}

public class Ex6 {

	public static void main(String[] args) {
		new MenuDemo();
	}

}
