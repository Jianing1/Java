package Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class MyInt implements java.io.Serializable {
	private int value;
	private String number;
	private static int count = 0;

	public MyInt(int v) {
		// TODO Auto-generated constructor stub
		this.number = "" + this.count;
		this.value = v;
		this.count++;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "第" + this.number + "个数字的值为：" + this.value;
	}
}

class ObjectStream {
	private String filename;

	public ObjectStream(String filename) {
		// TODO Auto-generated constructor stub
		this.filename = filename;
	}

	void write2File(Object obj[]) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream(this.filename);
		ObjectOutputStream dout = new ObjectOutputStream(fout);
		for (int i = 0; i < obj.length; i++) {
			dout.writeObject(obj[i]);
		}
		dout.close();
		fout.close();
		System.out.println("成功写入文件:" + this.filename);
	}

	void readFileContent() throws IOException, Exception {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream(filename);
		ObjectInputStream din = new ObjectInputStream(fin);
		System.out.println("从文件读取:" + this.filename);
		int count = 0;
		while (true) {
			try {
				MyInt myInt = (MyInt) din.readObject();
				System.out.println(myInt.toString());
				count++;
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println(e);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
				break;
			}
		}
		System.out.println("本次读入" + count + "个对象");
		din.close();
		fin.close();
	}
}

public class Exa4 {
	public static void main(String[] args) throws Exception {
		ObjectStream fileStream = new ObjectStream("ObjFile.dat");
		MyInt[] myInt = new MyInt[10];
		for (int i = 0; i < 10; i++) {
			int v = (int) (Math.random() * 100);
			myInt[i] = new MyInt(v);
		}
		fileStream.write2File(myInt);
		fileStream.readFileContent();
	}
}
