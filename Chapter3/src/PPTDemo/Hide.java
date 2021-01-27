package PPTDemo;

public class Hide {

	public static void main(String[] args) {
		temp2 t2 = new temp3();
		t2.print();
		System.out.print(t2.b + "+");
		System.out.print(t2.c + "=");
		System.out.println(t2.b + t2.c);
	}

}

class temp2 {
	public int b = 3;
	public int c = 9;

	void print() {
		System.out.println("father");
	}
}

class temp3 extends temp2 {
	public int b = 5;
	public int c = 6;

	void print() {
		System.out.println("son");
	}
}
