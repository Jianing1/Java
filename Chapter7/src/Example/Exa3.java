package Example;

class MyException extends Exception {
	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyException(String msg, Throwable e) {
		super(msg, e);
	}
}

public class Exa3 {
	public static void MyE() throws MyException {
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			throw new MyException(e.getMessage(), e.getCause());
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		try {
			Exa3.MyE();
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
