package Example;

public class 例3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.fn1();
		c.getB().fn2();
	}

}

class A22 {
	void fn1() {
		System.out.println("It is fn1.");
	}
}

abstract class B22 {
	abstract void fn2();
}

class C extends A22 {
	B22 getB() {
		return new B22() {
			public void fn2() {
				System.out.println("It is fn2.");
			}
		};
	}
}