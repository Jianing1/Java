package Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class FileStream {
	private String filename;

	public FileStream(String filename) {
		// TODO Auto-generated constructor stub
		this.filename = filename;
	}

	public void write2File(byte[] buffer) throws Exception {
		FileOutputStream fout = new FileOutputStream(this.filename);
		fout.write(buffer);
		fout.close();
		System.out.println("成功写入文件：" + this.filename);
	}

	public void readFileContent() throws Exception {
		FileInputStream fin = new FileInputStream(filename);
		System.out.println("从文件读取：" + this.filename);
		byte[] buffer = new byte[20];
		int count = 0;
		do {
			count = fin.read(buffer);
			System.out.println("本次读入=" + count + "个字节");
			for (int i = 0; i < count; i++) {
				System.out.print(buffer[i] + " ");
			}
			System.out.println();
		} while (count != -1);
		fin.close();
	}
}

public class Exa2 {
	public static void main(String[] args) throws Exception {
		byte[] buffer = new byte[100];
		for (int i = 0; i < 100; i++) {
			buffer[i] = (byte) (Math.random() * 100);
		}
		FileStream fileStream = new FileStream("Bytefile.dat");
		fileStream.write2File(buffer);
		fileStream.readFileContent();

	}
}
