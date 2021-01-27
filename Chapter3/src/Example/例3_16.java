package Example;

public class 例3_16 {
	private int index = 10;

	class Inner {
		private int index = 20;

		void print() {
			int index = 30;
			System.out.println(index);
			System.out.println(this.index);
			System.out.println(例3_16.this.index);
		}
	}

	Inner getInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		例3_16 outer = new 例3_16();
		Inner inner = outer.getInner();
		inner.print();
	}

}
