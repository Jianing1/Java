package Excercise;

class printNumber1 implements Runnable {
	private int num;

	public printNumber1(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < num; i++) {
			System.out.print("1" + " ");
		}
	}
}

class printchar1 implements Runnable {
public int num;
public printchar1(int num) {
	// TODO Auto-generated constructor stub
	this.num=num;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < num; i++) {
			System.out.print("a" + " ");
		}
	}
	
}

public class Thread2 {
	public static void main(String[] args) {
		printchar1 p1 = new printchar1(10);
		printNumber1 p2 = new printNumber1(10);
		Thread t1=new Thread(p2);
		Thread t2=new Thread(p1);
		t1.start();
		t2.start();
	}
}
