package Exa;

public class Àý4_6 {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int f(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			System.out.println("1!=1");
			System.out.println("0!=1");
			return 1;
		} else {
			System.out.println(n + "!=" + n + "*" + (n - 1) + "!");
			return n * f(n - 1);
		}
	}

	public static class test {
		public static void main(String[] args) {
			Àý4_6 e1 = new Àý4_6();
			int result = e1.f(10);
			e1.setN(10);
			System.out.println(e1.getN() + "µÄ½×³Ë=" + result);
		}
	}

}
