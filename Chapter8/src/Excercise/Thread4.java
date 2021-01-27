package Excercise;

class Buffer extends Thread {
	char chBuffer;
	private boolean empty = true;

	public synchronized void put(char ch) {
		// TODO Auto-generated method stub
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		chBuffer = ch;
		empty = false;
		notify();
	}

	public synchronized char get() {
		// TODO Auto-generated method stub
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		char chr = chBuffer;
		empty = true;
		chBuffer = '\0';
		return chr;
	}
}

class consumer extends Thread {
	public Buffer br;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			synchronized (br) {
				char ch = br.get();
				if (ch != '\0') {
					System.out.println("消费者消费了" + ch);
				} else {
					System.out.println("消费者无产品可以消费");
				}
			}
		}
		super.run();
	}
}

public class Thread4 {
	public static void main(String[] args) {
		Buffer br;
		
	}
}
