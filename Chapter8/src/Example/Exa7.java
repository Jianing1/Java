package Example;

import java.util.Random;

class Buffer1 {
	private char chBuffer;
	private boolean empty = true;

	public synchronized void put(char ch) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		chBuffer = ch;
		empty = false;
		notify();
	}

	public synchronized char get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		char chr = chBuffer;
		chBuffer = '\0';
		empty = true;
		notify();
		return chr;
	}
}

class Procedure1 extends Thread {
	private Buffer1 br;
	Random r = new Random();

	public Procedure1(Buffer1 br) {
		this.br = br;
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			char ch = (char) (65 + r.nextInt(20));
			br.put(ch);
			System.out.println("生产者" + i + "生产了产品" + ch);
			try {
				sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}

class Consumer1 extends Thread {
	private Buffer1 br;

	public Consumer1(Buffer1 br) {
		this.br = br;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = 0; i <= 5; i++) {
			synchronized (br) {
				char ch = br.get();
				if (ch != '\0') {
					System.out.println("消费者" + i + "消费了" + ch);
				} else {
					System.out.println("消费者" + i + "没有产品可以消费！");
				}
			}
			try {
				sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}

public class Exa7 {
	public static void main(String[] args) {
		Buffer1 br = new Buffer1();
		Procedure1 p = new Procedure1(br);
		Consumer1 c = new Consumer1(br);
		p.start();
		c.start();

	}
}
