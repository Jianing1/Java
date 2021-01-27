package Example;

public class 例3_14 {
	private static int i = 1;
	private int j = 10;
	private int k = 20;

	public static void outer_f1() {
	}

	public void outer_f2() {
	}

	class Inner {
		int j = 100;
		int inner_i = 1;

		void inner_f1() {
			int j = 200;
			System.out.println(i);
			System.out.println(j);
			System.out.println(this.j);
			System.out.println(例3_14.this.j);
			System.out.println(k);

			outer_f1();
			outer_f2();
		}
	}

	public void outer_f3() {
		Inner inner = new Inner();
		inner.inner_f1();
	}

	public static void oute_f4() {
		例3_14 out = new 例3_14();
		Inner inner = out.new Inner();
		inner.inner_f1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oute_f4();
	}

}
