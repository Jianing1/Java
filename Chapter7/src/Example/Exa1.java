package Example;

public class Exa1 {
	public static void error() {
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			try {
				a[i] = 10 / i;
			} catch (ArithmeticException e) {
				e.printStackTrace();
				// TODO: handle exception
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("下标越界处为" + e.getMessage());
			} finally {
				System.out.println("循环次数为i=" + i);
			}
		}
	}

	public static void main(String[] args) {
		Exa1.error();
	}
}
