package Example;

public class 例3_13 extends Parent13 {
	int i = 10;

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		例3_13 son = new 例3_13();
		System.out.println("son.i= " + son.i);
		son.setI(100);
		System.out.println("After setI(100 : son.i = " + son.i);
		Parent13 parent = son;
		System.out.println("See son as Parent : parent.i  = " + parent.i);
		System.out.println("See son as Parent: son.i=  " + son.i);
		System.out.println("See son as Parent : son.getI(200) = " + son.getI(200));
		System.out.println("See son as Parent : new Parent().getI(200) = " + new Parent13().getI(200));
	}

}

class Parent13 {
	int i = 10;

	public void setI(int i) {
		this.i = i;
	}

	public int getI(int i) {
		return this.i;
	}
}