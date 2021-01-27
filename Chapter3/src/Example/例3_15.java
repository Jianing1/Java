package Example;

public class 例3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner = outer.getInner();
		inner.print();
	}

}

class Outer {
	private int index = 10;

	class Inner {
		private int index = 20;

		void print() {
			int index = 30;
			System.out.println(index);
			System.out.println(this.index);
			System.out.println(Outer.this.index);
		}
	}

	Inner getInner() {
		return new Inner();
	}
}