package Ex;

public class Ex8 {

	public static void main(String[] args) {
		int temp = 0;
		for (int i = 0; i < 1000; i++) {
			temp += i;
			if (temp > 1000) {
				System.out.println("1+2+3+...>1000的最大�??:" + temp);
				break;
			}
		}

	}

}
