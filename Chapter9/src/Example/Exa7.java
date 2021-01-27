package Example;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

class DirFilterList {
	public DirFilterList(InnerFilter filter) {
		File dir = new File(".");
		// 当前目录
		int count_dirs = 0, count_files = 0;
		// 目录数和文件数
		long byte_files = 0;
		// 所有文件总字节数
		System.out.println(dir.getAbsolutePath() + " 目录\r\n");
		File[] files = dir.listFiles(filter);
		// 执行上句，就去找accept()
		for (int i = 0; i < files.length; i++) {
			System.out.print(files[i].getName() + "\t"); // 显示文件名
			if (files[i].isFile()) { // 判断指定File对象是否是文件
				System.out.print(files[i].length() + "B\t");
				// 显示文件长度
				count_files++;
				byte_files += files[i].length();
			} else {
				System.out.print("<DIR>\t");
				count_dirs++;
			}
			System.out.println(new Date(files[i].lastModified()));
		}
		System.out.println("\r\n共有 " + count_files + " 个文件，总字节数为 " + byte_files);
		System.out.println("共有 " + count_dirs + " 个目录");
	}
}

class InnerFilter implements FilenameFilter {
	private String prefix; // 文件名前缀
	private String extend; // 文件扩展名

	public InnerFilter(String filterStr) {
		this.prefix = "";
		this.extend = "";
		filterStr = filterStr.toLowerCase();
		int i = filterStr.indexOf('*');
		if (i > 0)
			this.prefix = filterStr.substring(0, i); // 获得*之前的字符串
		int j = filterStr.indexOf('.');
		if (j > 0) {
			this.extend = filterStr.substring(j + 1); // 获得.之后的文件扩展名字符串
			if (this.extend.equals("*")) // 识别"*.*"
				this.extend = "";
		}
	}

	public InnerFilter() {
		this("*.*");
	}

	public boolean accept(File dir, String filename) {
		filename = filename.toLowerCase();
		return (filename.startsWith(this.prefix)) & (filename.endsWith(this.extend));
	}

}

public class Exa7 {
	public static void main(String[] args) {
		InnerFilter filter = new InnerFilter("*.java");
		new DirFilterList(filter);
	}

}