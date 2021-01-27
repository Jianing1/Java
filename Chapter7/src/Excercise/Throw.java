package Excercise;

public class Throw {
	public static void main(String[] args) {
		try {
			double a;
			for (int i = 10; i >= 0; i--) {
				a = 10 / i;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
