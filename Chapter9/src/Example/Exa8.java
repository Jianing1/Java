package Example;

import java.io.*;

class FileSort {
	private RandomAccessFile rafile;

	public FileSort(String filename) throws IOException {
		File file = new File(filename);
		if (file.exists())
			// 如果指定文件已存在，则删除
			file.delete();
		this.rafile = new RandomAccessFile(filename, "rw");
		// 创建文件对象，可读写
	}

	public void sort(int k, long pos) throws IOException { // 从pos位置开始排序数字k
		this.rafile.seek(pos); // 设置文件读指针
		boolean insert = false;
		while (true) // 文件未结束时
			try {
				int temp = this.rafile.readInt(); // 读取一个整数
				if (temp > k) {
					long currPos = this.rafile.getFilePointer();
					// 获得当前位置
					this.rafile.seek(currPos - 4);// 后退4个字节，对int类型
					this.rafile.writeInt(k); // k插入当前位置
					this.sort(temp, currPos); // 从当前位置开始，对temp排序
					insert = true;
				}
			} catch (EOFException ioe) { // 捕获到达文件尾异常
				if (insert == false) {
					this.rafile.writeInt(k);
					// 写入k
				}
				break;
			}
	}

	public void append(int[] table) throws IOException { // 在文件中添加数据
		for (int i = 0; i < table.length; i++) {
			this.sort(table[i], 0);
		}
		System.out.println();
	}

	public void readFromFile() throws IOException { // 从指定文件中读取整数
		this.rafile.seek(0);
		while (true) // 文件未结束时
			try {
				System.out.print(this.rafile.readInt() + "  ");
			} catch (EOFException ioe) {
				System.out.println();
				this.rafile.close(); // 关闭文件
				break;
			}
	}
}

public class Exa8 {
	public static void main(String[] args) throws IOException {
		int[] table = { 5, 3, 1, 2, 5, 6, 10, 8 };
		FileSort fileSort = new FileSort("Random.dat");
		fileSort.append(table);
		fileSort.readFromFile();
	}
}
