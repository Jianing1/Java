package Excercise;

class printNumber extends Thread {
	private int num;

	public printNumber(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < num; i++) {
			System.out.print("1" + " ");
		}
		super.run();
	}
}

class printchar extends Thread {
	int num;

	public printchar(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < num; i++) {
			System.out.print("a");
		}
		super.run();
	}
}

public class Thread1 {
	public static void main(String[] args) {
		printchar p1 = new printchar(10);
		printNumber p2 = new printNumber(10);
		p1.start();
		p2.start();
	}
}
