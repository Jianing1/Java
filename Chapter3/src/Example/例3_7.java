package Example;

public class 例3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father1 f = new Son1();
		System.out.println(f);
	}

}

class Father1 {
	private String name = "FATHER";
	private int i = 1;

	public Father1() {
		whoAmI();
		tellName(name);
		tellValue(i);
	}

	public void whoAmI() {
		System.out.println("Father says,I am" + name + ",i=" + i);
	}

	public void tellName(String name) {
		System.out.println("Father's name is" + name + ",i=" + i);

	}

	public void tellValue(int i) {
		System.out.println();
		System.out.println("Father's name is" + name + ",i=" + i);
	}
}

class Son1 extends Father1 {
	private String name = "SON";
	private int i = 2;

	public Son1() {
		whoAmI();
		tellName(name);
		tellValue(i);
	}

	public void whoAmI() {
		System.out.println("Son says,I am" + name + ",i=" + i);
	}

	public void tellName(String name) {
		System.out.println("Son's name is" + name + ",i=" + i);

	}

	public void tellValue(int i) {
		System.out.println("Father's name is" + name + ",i=" + i);
	}
}