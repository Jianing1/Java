package PPTDemo;
class A {
	public int x = 2;
	private int y = 2;
	protected int z;

	A() {
		x++;
		showX();
	}

	public void showX() {
		System.out.println("A.x=" + x);
	}

	public int getY() {
		return y;
	}
}

class B extends A {
	B(int x) {
		x = x + 2;
		showX();
		
	}

	public void showX() {
		System.out.println("B.x=" + x);
	}

	public int getY() {
		System.out.println("B.y=" + (super.getY() + x));
		return super.getY() + x;
	}
}
public class PPT3_3_3_8 {
	public static void main(String[] args) {
		B b = new B(0);
		int y = b.getY();
	}
}

