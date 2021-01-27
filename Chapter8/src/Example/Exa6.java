package Example;

import java.util.Random;

class Buffer {
	private char chBuffer;

	public synchronized void put(char ch) {
		chBuffer = ch;
	}

	public synchronized char get() {
		char chr = chBuffer;
		chBuffer = '\0';
		return chr;
	}
}

class Procedure extends Thread {
	private Buffer br;
	Random r = new Random();

	public Procedure(Buffer br) {
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

class Consumer extends Thread {
	private Buffer br;

	public Consumer(Buffer br) {
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

public class Exa6 {
	public static void main(String[] args) {
		Buffer br = new Buffer();
		Procedure p = new Procedure(br);
		Consumer c = new Consumer(br);
		p.start();
		c.start();

	}
}
