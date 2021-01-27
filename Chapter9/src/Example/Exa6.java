package Example;

import java.io.File;
import java.util.Date;

class DirList {
	public DirList() {
		// TODO Auto-generated constructor stub
		File dir = new File(".");
		int count_dirs = 0;
		int count_files = 0;
		long byte_files = 0;
		System.out.println(dir.getAbsolutePath() + "目录\r\n");
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.print(files[i].getName() + "\t");
			if (files[i].isFile()) {
				System.out.print(files[i].length() + "B\t");
				count_files++;
				byte_files += files[i].length();
			} else {
				System.out.print("<DIR>\t");
				count_dirs++;
			}
			System.out.println(new Date(files[i].lastModified()));
		}
		System.out.println("\r\n共有 " + count_files + " 个文件，总字节为:" + byte_files);
		System.out.println("共有 " + count_dirs + " 个目录");
	}
}

public class Exa6 {
	public static void main(String[] args) {
		new DirList();
	}
}
