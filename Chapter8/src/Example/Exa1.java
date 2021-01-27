package Example;

class PrintLetter extends Thread {
	private char letter;
	private int num;

	public PrintLetter(char ch, int num) {
		letter = ch;
		this.num = num;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = 0; i < num; i++) {
			System.out.print(letter);
		}
		System.out.println();
	}
}

class PrintNumber extends Thread {
	private int num;

	public PrintNumber(int num) {
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

public class Exa1 {
	public static void main(String[] args) {
		PrintLetter p1 = new PrintLetter('a', 50);
		PrintNumber p2 = new PrintNumber(50);
		p1.run();
		p2.run();
	}
}
