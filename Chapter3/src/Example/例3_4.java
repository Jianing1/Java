package Example;

public class 例3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass sup = new SuperClass();
		SubClass sub = new SubClass();
		SuperClass supsub = new SubClass();
		System.out.println("sup.plus()= " + sup.plus());
		System.out.println("sub.plus()= " + sub.plus());
		System.out.println("supsub.plus()= " + supsub.plus());

	}

}

class SuperClass {
	private int i = 1;
	int j = 2;

	int plus() {
		return i + j;
	}
}

class SubClass extends SuperClass {
	int i = 10, j = 20;

	int subduce() {
		return j - super.j;
	}
}