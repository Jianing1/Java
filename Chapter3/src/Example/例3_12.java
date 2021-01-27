package Example;

public class 例3_12 extends B12 {
	int i;

	public void getC(int i) {
		getB(1);
		System.out.println("i=" + i);
	}

	public void getA(int i) {
		System.out.println("i=" + i);
		System.out.println("i=" + i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B12 c = new 例3_12();
		c.getB(3);
	}

}

class A12 {
	int i;

	public void getA(int i) {
		System.out.println("i=" + i);
	}
}

class B12 extends A12 {
	int i;

	public void getB(int i) {
		getA(1);
		System.out.println("i=" + i);
		System.out.println("i=" + i);
	}
}