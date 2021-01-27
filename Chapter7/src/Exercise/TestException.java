package Exercise;

import java.util.Scanner;

class MyException extends RuntimeException {
	MyException(String s) {
		super(s);
	}
}

public class TestException {
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("«Î ‰»Î»˝Ãı±ﬂ:");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		s.close();
		try {
			method(a, b, c);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	public static void method(int a, int b, int c) throws MyException {
		if ((a + b) < c || (a + c) < b || (b + c) < a)
			throw new MyException("can not construct a triangle");
		else if (a < 0 || b < 0 || c < 0)
			throw new MyException("input is invalid");
		else {
			System.out.println(a + b + c);
		}

	}
}
