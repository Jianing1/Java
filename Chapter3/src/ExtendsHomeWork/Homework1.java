package ExtendsHomeWork;

class Graph {
	double square, girth;
}

class SanJiao extends Graph {
	public SanJiao(double a, double b, double c, double h) {
		girth = a + b + c;
		square = (h * a) / 2;
	}
}

class Yvan extends Graph {
	public Yvan(double r) {
		square = Math.PI * r * r;
		girth = 2 * Math.PI * r;
	}
}

class ZhengFang extends Graph {
	public ZhengFang(double a) {
		square = a * a;
		girth = 4 * a;
	}
}

public class Homework1 {

	public static void main(String[] args) {
		Graph g1 = new ZhengFang(1.0);// constructor
		Graph g2 = new Yvan(1.0);
		Graph g3 = new SanJiao(1.0, 2.0, 3.0, 1.0);
		System.out.print("ZhengFang(square girth):");
		System.out.print(g1.square + " ");
		System.out.println(g1.girth);
		System.out.print("Yvan(square girth):");
		System.out.print(g2.square + " ");
		System.out.println(g2.girth);
		System.out.print("SanJiao(square girth):");
		System.out.print(g3.square + " ");
		System.out.print(g3.girth);

	}
}
