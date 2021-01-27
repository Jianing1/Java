package Ex;

import java.util.Scanner;

public class Ex11 {
	static int Fibonacci1(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		else
			return Fibonacci1(n - 1) + Fibonacci1(n - 2);
	}
	static int Fibonacci2(int n) {
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		int fib1=0;
		int fib2=1;
		int fibn=0;
		for(int i=3;i<=n;i++) {
			fibn=fib1+fib2;
			fib1=fib2;
			fib2=fibn;
		}
		return fibn;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Fibonacci1(n));
		System.out.println(Fibonacci2(n));
		sc.close();
	}

}
