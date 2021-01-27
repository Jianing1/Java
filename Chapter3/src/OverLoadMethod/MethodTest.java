package OverLoadMethod;

public class MethodTest {

	public static void main(String[] args) {
		Method method = new Method();
		int num1 = method.calculate(10);
		int num2 = method.calculate(6, 20);
		double num3 = method.calculate(2.1, 10.0);

		System.out.println("num1 is " + num1);
		System.out.println("num2 is " + num2);
		System.out.println("num3 is " + num3);

	}

}
