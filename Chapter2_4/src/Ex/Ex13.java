package Ex;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		while (sc.hasNextInt()) {
			y = sc.nextInt();
			m = sc.nextInt();
			d = sc.nextInt();
			if (m == 1 || m == 2) {
				m += 12;
				y--;
			}
			int iWeek = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
			System.out.print(y + "年" + m + "月" + d + "日是");
			switch (iWeek) {
			case 0:
				System.out.print("星期一");
				break;
			case 1:
				System.out.print("星期二");
				break;
			case 2:
				System.out.print("星期三");
				break;
			case 3:
				System.out.print("星期四");
				break;
			case 4:
				System.out.print("星期五");
				break;
			case 5:
				System.out.print("星期六");
				break;
			case 6:
				System.out.print("星期七");
				break;

			}
		}
		sc.close();

	}

}
