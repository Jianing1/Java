package Example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class DataStream {
	private String filename;

	public DataStream(String filename) {
		// TODO Auto-generated constructor stub
		this.filename = filename;
	}

	private void write2File(double[] buffer) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream(filename);
		DataOutputStream dout = new DataOutputStream(fout);
		for (int i = 0; i < buffer.length; i++) {
			dout.writeDouble(buffer[i]);
		}
		dout.close();
		fout.close();
		System.out.println("成功写入文件：" + filename);
	}

	private void readFileConten() throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream(filename);
		DataInputStream din = new DataInputStream(fin);
		System.out.println("从文件读取：" + filename);
		int count = 0;
		while (true) {
			try {
				double i = din.readDouble();
				System.out.println(i + " ");
			} catch (EOFException e) {
				// TODO: handle exception
				break;
			}
			System.out.println("本次读入=" + count + "个双精度数");
			din.close();
			fin.close();
		}

	}

}

public class Exa3 {
	public static void main(String[] args) {
		double[] buffer = new double[100];
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = Math.random() * 100;
		}
		DataStream filestream = new DataStream("DoubleFile.dat");
	}
}
