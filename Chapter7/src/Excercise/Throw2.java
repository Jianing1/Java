package Excercise;

class MyException1 extends Exception {
	public MyException1(String msg, Throwable cause) {
		// TODO Auto-generated constructor stub
		super(msg, cause);
	}
}

class Sample_3 {
	void MyE() throws MyException1 {
		// TODO Auto-generated method stub
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			// TODO: handle exception
			throw new MyException1(e.getMessage(), e.getCause());
		}
	}
}

public class Throw2 {
	public static void main(String[] args) {
		try {
			new Sample_3().MyE();
		} catch (MyException1 e) {
			// TODO: handle exception
			System.out.println(e);
			//e.printStackTrace();
		}
	}
}
