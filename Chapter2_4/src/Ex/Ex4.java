package Ex;

public class Ex4 {

	public static void main(String[] args) {
		boolean b1, b2, b3, b4, b5;
		String str = null;
		int i = 5, j = 5, k = 5, t = 5;
		b1 = true || (++i > 5);
		b2 = true & (++j > 5);
		b3 = true | (++k > 5);
		b4 = false && (++t > 5);
		b5 = (str != null) && (str.equals(""));
		System.out.println("i = " + i + ", j = " + j);
		System.out.println("b1 = " + b1 + ", b2 = " + b2);
		System.out.println("k = " + k + ", t = " + t);
		System.out.println("b3 = " + b3 + ", b4 = " + b4);
		System.out.println(b5);

	}

}
