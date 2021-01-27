package Ex;

public class Ex9 {

	public static void main(String[] args) {
		int min = 2;
		int max = 100;
		int numCount = 0;
		for (int i = min; i <= max; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				numCount++;

				System.out.print(i + " ");
				if (numCount % 5 == 0) {
					System.out.println('\n');
				}
			}
		}

	}

}
