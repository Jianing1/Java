package Example;

import java.io.IOException;

public class Exa1 {
	int count = 0;
	byte buffer[];

	private void stdIo() throws IOException {
		// TODO Auto-generated method stub
		do {
			System.out.println("请输入：");
			buffer = new byte[512];
			count = System.in.read(buffer);
			System.out.println("输入的字节为：");
			for (int i = 0; i < count; i++) {
				System.out.print(buffer[i]);
				System.out.print(" ");
			}
			System.out.println();
			System.out.println("输入了" + count + "个字节");
		} while (count != 2);
	}

	public static void main(String[] args) throws IOException {
		new Exa1().stdIo();
	}
}
