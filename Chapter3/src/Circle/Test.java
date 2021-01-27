package Circle;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.print("Please input the r to calculate the circle:");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		c.setR(a);
		s.close();
		System.out.print("The area for the r that you have input is ");
		System.out.println(c.area());
		System.out.print("The circumference for the r that you have input is ");
		System.out.println(c.circumference());
	}
}
