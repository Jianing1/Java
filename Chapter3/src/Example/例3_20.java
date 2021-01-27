package Example;

public class 例3_20 extends WithInner.Inner {
	例3_20(WithInner wi) {
		wi.super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithInner wi = new WithInner();
		例3_20 test = new 例3_20(wi);
		test.sayHello();
	}

}

class WithInner {
	class Inner {
		public void sayHello() {
			System.out.println("Hello!");
		}
	}
}