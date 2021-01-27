package Example;

abstract class A19 {
	abstract public void sayHello();
}

public class 例3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * new Outer().callInner(new A() { public void sayHello() {
		 * System.out.println(this); System.out.println("Hello!"); } });
		 */
	}

	public void callInner(A19 a) {
		a.sayHello();
	}

}
