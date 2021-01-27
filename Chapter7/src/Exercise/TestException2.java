package Exercise;

class MyException1 extends Exception {
	MyException1(String s) {
		super(s);
	}

	public MyException1() {
		super();
		// TODO Auto-generated constructor stub
	}
}

public class TestException2 {
	public static void main(String[] args) {
		try {
			method(3);
		} catch (MyException1 e) {
			e.printStackTrace();
		}
	}

	public static void method(int score) throws MyException1 {
		if (score < 0)
			throw new MyException1("1");
		else {
			System.out.println("b");
		}
	}
}
