package Ex;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println((a / 100) + ((a % 100) / 10) + (a % 10));

	}

}
