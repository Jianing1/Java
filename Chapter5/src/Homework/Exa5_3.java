package Homework;


public class Exa5_3 {
	public static void copy1(String s, StringBuffer num) {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) <= '8' && s.charAt(i) >= '1') {
				num.append(s.charAt(i));
			}

		}
	}
	public static void copy2(String s, StringBuffer string) {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) <= 'G' && s.charAt(i) >= 'A') {
				string.append(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		String s = "A1B2C3D4E5F6G7H8";

		StringBuffer num = new StringBuffer();
		StringBuffer string = new StringBuffer();
		copy1(s, num);
		copy2(s, string);
		System.out.println(num);
		System.out.println(string);
	}

}
