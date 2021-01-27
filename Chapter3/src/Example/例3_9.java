package Example;

public class 例3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a3 = new A3();
		A3 a4 = new B3();
		B3 b3 = new B3();
		C3 c3 = new C3();
		D3 d3 = new D3();
		System.out.println(a3.show(b3));
		System.out.println(a3.show(c3));
		System.out.println(a3.show(d3));
		System.out.println(a4.show(b3));
		System.out.println(a4.show(c3));
		System.out.println(a4.show(d3));
		System.out.println(b3.show(b3));
		System.out.println(b3.show(c3));
		System.out.println(b3.show(d3));
	}

}

class A3 {
	public String show(D3 obj) {
		return ("A and D");
	}

	public String show(A3 obj) {
		return ("A and A");
	}

	public String show(C3 obj) {
		return ("A and C");
	}
}

class B3 extends A3 {
	public String show(B3 obj) {
		return ("B and B");
	}

	public String show(A3 obj) {
		return ("B and A");
	}

	public String show(C3 obj) {
		return ("B and C");
	}
}

class C3 extends B3 {
}

class D3 extends B3 {
}