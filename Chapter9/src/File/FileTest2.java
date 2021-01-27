package File;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("C:\\Users\\Jianing\\Desktop\\a\\cc.txt");
		boolean rst = file1.createNewFile();
		// 文件已存在则创建失败，返回false
		System.out.println(rst);// true

		File file2 = new File("dd.txt");
		// 如果没有指定文件路径，则默认在项目路径下
		boolean rst2 = file2.createNewFile();
		System.out.println(rst2);
		// creatNewFile时候路径不存在则抛出io异常
		File file3 = new File("C:\\Users\\Jianing\\Desktop\\aaaa\\cc.txt");
		boolean rst3 = file3.createNewFile();
		System.out.println(rst3);
	}
}
