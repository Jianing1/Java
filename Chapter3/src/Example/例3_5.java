package Example;

public class 例3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		A c = new B();
		System.out.println("a.i=" + a.i + "," + "a.j=" + a.j + "," + "a.plus()=" + a.plus());
		System.out.println("b.i=" + b.i + "," + "b.j=" + b.j + "," + "b.k=" + b.k + "," + "b.plus()=" + b.plus());

		System.out.println("c.i=" + c.i + "," + "c.j=" + c.j + "," + "c.plus()=" + c.plus());
	}

}

class A {
	int i = 1, j = 2;

	int plus() {
		return i + j;
	}
}

class B extends A {
	int i = 10, k = 20;

	int plus() {
		return i + j + k;
	}
}