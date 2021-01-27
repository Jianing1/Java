package Homework;

import java.util.Scanner;

public class Exa5_1 {

	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		s.close();
		int max = a[0];
		int min = a[0];
		int sum = 0;
		for (int i : a) {
			if (i > max)
				max = i;
			if (i < min)
				min = i;
			sum += i;
		}
		double ave=sum/10;
		System.out.println("max="+max+" "+"min="+min+" "+"ave="+ave);
	}

}
