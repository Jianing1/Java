package Ex;

import java.util.Scanner;

public class Ex12 {
	static int gbc(int a, int b) {
		int temp = 0;
		while (b > 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		while (sc.hasNextInt()) {
			m = sc.nextInt();
			n = sc.nextInt();
			System.out.println(gbc(m, n));

		}

		sc.close();
	}

}
