package package2;

import package1.Superclass;

public class Subclass2 extends Superclass {
	void limit() {
//		SuperClass.i++;
		j++;
		super.j++;
		Superclass.j1--;
		j1++;
//		SuperClass.k++;
		Superclass.m--;
	}

	public static void main(String[] args) {
		Superclass sup = new Superclass();
//		System.out.println(sup.j++);
//		sup.limit();
		System.out.println(sup.j1++);
	}
}
