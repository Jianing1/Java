package Exa;

public class Àı4_4 {
	private int startNum, sum, endNum;

	public void set(int startNum, int endNum) {
		this.startNum = startNum;
		this.endNum = endNum;
	}

	public void doWhileEx() {
		do {
			if (startNum % 3 == 0) {
				System.out.println(startNum);
			}
			startNum++;
		} while (startNum <= endNum);
	}

	public static class Test {
		public static void main(String[] args) {
			Àı4_4 e1 = new Àı4_4();
			e1.set(1, 100);
			e1.doWhileEx();
		}
	}

}
