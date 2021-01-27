package Example;

public class 例3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a = new A2();
		B2 b = new B2();
		A2 c = new B2();
		System.out.println("a.i=" + a.i + ",  " + "a.j=" + a.j + ",  a.plus=" + a.plus());
		System.out.println("b.i=" + b.i + ",  " + "b.j=" + b.j + ",  b.plus=" + b.plus());
		// System.out.println("c.i="+c.i+","+"c.j="+c.j+"c.k="+c.k+" ,
		// c.plus"+c.plus());//上转型只能调用重写的
		System.out.println("c.i=" + c.i + ",  " + "c.j=" + c.j + ",  c.plus=" + c.plus());
	}

}

class A2 {
	static int i = 1, j = 2;

	static int plus() {
		return i + j;
	}
}

class B2 extends A2 {
	static int i = 10, k = 20;

	static int plus() {
		return i + j + k;
	}
}
