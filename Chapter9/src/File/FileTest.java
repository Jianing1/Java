package File;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		// 根据路径得到一个File对象
		// Java中一个\代表是转移字符开始标志，表示路径要用两个\\表示
		File file1 = new File("C:\\Users\\Jianing\\Desktop\\a\\b.txt");
		// 文件夹是一种特殊的文件,只不过文件夹中的内容是其他的文件夹或文件
		File file2 = new File("C:\\Users\\Jianing\\Desktop\\a", "b.txt");
		File file = new File("C:\\Users\\Jianing\\Desktop\\a");
		File file3 = new File(file, "b.txt");
	}
}
