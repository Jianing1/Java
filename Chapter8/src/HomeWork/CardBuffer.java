package HomeWork;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//发牌程序
public class CardBuffer {

	private int value;
	private int order = 0;
	private boolean isEmpty;

	public synchronized void put(int i) {
		while (!isEmpty)// 没有发牌，value值为空，等待
			try {
				this.wait();
			} catch (InterruptedException e) {

			}
		isEmpty = false;// 标记value值不为空
		value = i;// value获得一张牌
		notifyAll();// 唤醒所有等待共用锁的线程
	}

	public synchronized int get(int order) {
		while (isEmpty || (this.order != order))// 玩家的牌value是空或者没有轮到自己的时候等待
			try {
				this.wait();
			} catch (InterruptedException e) {

			}
		isEmpty = true;// 标记value值为空
		notifyAll();// 唤醒所有其他等待的线程
		this.order = (this.order + 1) % 4;// 加1使牌的次序轮转
		return value;
	}

	public static void main(String arg[]) {
		new cardJFrame();
	}
}

//搜的线程只管搜，发牌线程只管发牌
class player extends Thread {

	private CardBuffer cB;
	private JTextArea text;
	private int order;// 信号量，约定取牌线程

	public player(CardBuffer cB, JTextArea text, int order) {
		this.cB = cB;
		this.text = text;
		this.order = order;
	}

	public void run() {
		while (true) {
			text.append(" " + cB.get(this.order));// 按顺序给每一个玩家加上发了的排
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}

class sender extends Thread {

	private CardBuffer cB;
	private int count;
	private java.util.ArrayList<Integer> list;// 数组集合

	@SuppressWarnings("deprecation")
	public sender(CardBuffer cB, int count) {
		this.cB = cB;
		this.count = count;
		list = new ArrayList<Integer>();
		for (int i = 1; i <= this.count; i++) {
			list.add(new Integer(i));// 把1~52加入数组中
			java.util.Random rand = new Random();
			java.util.Collections.shuffle(list, rand);// shuffle洗牌算法
		}
	}

	public void run() {
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			cB.put((Integer) it.next());// 把52张牌发出去
		}
	}
}

class cardJFrame extends JFrame {
	public cardJFrame() {
		super("发牌");
		this.setBounds(300, 240, 460, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(3, 3));
		c.add(new JPanel());

		JTextArea text[] = new JTextArea[4];// 4个玩家
		Font f = new Font("Helvetia", Font.PLAIN, 16);// 字体
		for (int i = 0; i < text.length; i++) {
			text[i] = new JTextArea();
			text[i].setLineWrap(true);// 设置文本自动换行
			text[i].setEditable(false);// 不可编辑
			text[i].setFont(f);
			c.add(text[i]);
			c.add(new JPanel());
		}
		this.setVisible(true);
		CardBuffer cB = new CardBuffer();// 缓存
		sender s = new sender(cB, 52);// new一个发送线程
		s.setPriority(10);// 设置最高优先级
		s.start();
		for (int i = 0; i < text.length; i++) {// 玩家依次发牌
			(new player(cB, text[i], i)).start();
		}

	}

}
