package Example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ShowState extends JFrame implements ActionListener, Runnable {
	JTextArea ta;
	JButton button_start, button_interrupt, button_terminate;
	JTextField text_state;
	JLabel label;
	Thread t;

	public ShowState() {
		// TODO Auto-generated constructor stub
		super("演示线程状态");
		this.setSize(450, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ta = new JTextArea();
		ta.setAutoscrolls(true);
		this.add(ta);
		button_start = new JButton("启动");
		button_start.addActionListener(this);
		button_interrupt = new JButton("中断");
		button_interrupt.addActionListener(this);
		button_terminate = new JButton("线程结束后");
		button_terminate.addActionListener(this);
		button_terminate.setEnabled(false);
		button_interrupt.setEnabled(false);
		t = new Thread(this);
		label = new JLabel("线程状态：");
		text_state = new JTextField(" " + t.getState(), 10);
		text_state.setEnabled(false);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(button_interrupt);
		panel.add(button_start);
		panel.add(button_terminate);
		panel.add(label);
		panel.add(text_state);
		this.add(panel, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 1;
		while (t.isAlive() && !t.isInterrupted()) {
			String str = "a";
			if (i % 20 == 0) {
				str += "\n";
				i++;
				ta.append(str);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO: handle exception
					break;
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button_start) {
			t = new Thread(this);
			t.start();
			text_state.setText(" " + t.getState());
			button_start.setEnabled(false);
			button_interrupt.setEnabled(true);
		}
		if (e.getSource() == button_interrupt) {
			t.interrupt();
			text_state.setText(" " + t.getState());
			button_start.setEnabled(true);
			button_interrupt.setEnabled(false);
			button_terminate.setEnabled(true);
		}
		if (e.getSource() == button_terminate) {
			text_state.setText(" " + t.getState());
		}
	}
}

public class Exa3 {
	public static void main(String[] args) {
		new ShowState();
	}
}
