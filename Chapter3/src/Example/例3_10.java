package Example;

public class 例3_10 {
	public boolean isSharp() {
		return true;
	}

	public int getSides() {
		return 0;
	}

	public int getSides(Triangle tri) {
		return 3;
	}

	public int getSides(Rectangle rec) {
		return 4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle();
		System.out.println("Triangle is a type of sharp?" + tri.isSharp());
		例3_10 shape = new Triangle();
		System.out.println("My shape has " + shape.getSides() + " sides.");
	}

}

class Triangle extends 例3_10 {
	public int getSides() {
		return 3;
	}
}

class Rectangle extends 例3_10 {
	public int getSides(int i) {
		return i;
	}
}
