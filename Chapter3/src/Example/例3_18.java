package Example;

public class 例3_18 {
	int num = 10;

	public void print(final int aArgs) {
		class Inner {
			int num = 20;

			public Inner() {
				System.out.println("This is Inner");
			}

			public void print() {
				int num = 30;
				System.out.println(this);
				System.out.println(num);
				System.out.println(this.num);
				System.out.println(例3_18.this.toString());
				System.out.println(aArgs);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		例3_18 outer = new 例3_18();
		outer.print(40);
	}

}
