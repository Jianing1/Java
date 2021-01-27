package Example;

public class Exa2 {
	static void throwsEx() throws ArithmeticException {
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = 10 / i;
		}
	}

	public static void main(String[] args) {
		try {
			Exa2.throwsEx();
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
