package Exa;

public class Àý2_4 {
	public static void self() {
		int j = 2, i = 3;
		j *= i -= (i++);
		System.out.println("j=" + j + "," + "i=" + i);
		j = 2;
		i = 3;
		j *= i -= (++i);
		System.out.println("j=" + j + "," + "i=" + i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Àý2_4.self();

	}

}
