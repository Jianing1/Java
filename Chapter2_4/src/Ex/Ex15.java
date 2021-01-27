package Ex;

public class Ex15 {
	static void Traverse1(int[] a, int n) {
		for (int j = 0; j < 9 - n; j++) {
			System.out.print(" ");
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}

	static void Traverse2(int[] a, int n) {
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		for (int j = 0; j < 9 - n; j++) {
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			Traverse1(a, i + 1);
			Traverse2(a, i);
			System.out.println();
		}

	}

}
