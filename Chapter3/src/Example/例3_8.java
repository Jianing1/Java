package Example;

public class 例3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = new B1(0);
		int y = b.getY();
	}

}

class A1 {
	public static int x = 2;
	private int y = 2;
	protected int z;

	A1() {
		x = x + 1;
		showX();
	}

	public void showX() {
		System.out.println("A.x=" + x);
	}

	public int getY() {
		return y;
	}
}

class B1 extends A1 {
	B1(int x) {
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