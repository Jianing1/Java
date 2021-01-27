package Example;

class PrintLetter1 implements Runnable {
	private char letter;
	private int num;

	public PrintLetter1(char letter, int num) {
		this.letter = letter;
		this.num = num;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < num; i++) {
			System.out.print(letter);
		}
		System.out.println();
		// TODO Auto-generated method stub

	}
}

class PrintNumber1 implements Runnable {
	private int num;

	public PrintNumber1(int num) {
		this.num = num;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = 0; i < num; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
}

public class Exa2 {
	public static void main(String[] args) {
		PrintNumber1 p1 = new PrintNumber1(50);
		PrintLetter1 p2 = new PrintLetter1('a', 50);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);

		t1.start();
		t2.start();
	}
}
