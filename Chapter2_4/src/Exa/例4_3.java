package Exa;

public class 例4_3 {
	private int startNum, sum, endNum;

	public void set(int startNum, int endNum) {
		this.startNum = startNum;
		this.endNum = endNum;
	}

	public void print() {
		System.out.println(this.startNum + "到" + this.endNum + "之间连加和:");
	}

	public void whileEx() {
		while (startNum <= endNum) {
			sum += startNum;
			startNum++;
		}
		System.out.println("sum=" + sum + ",最后计数器多运行一次,值为" + startNum);
	}

	public static class TestWhile {
		public static void main(String[] args) {
			例4_3 e1 = new 例4_3();
			e1.set(1, 100);
			e1.print();
			e1.whileEx();

		}
	}

}
