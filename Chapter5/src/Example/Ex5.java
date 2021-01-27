package Example;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		System.out.println("LinkList:");
		String a="A",b="B",c="C",test="Test";
		List<String>list=new LinkedList<String>();
		list.add(a);
		list.add(b);
		list.add(c);
		System.out.println(((LinkedList<String>) list).getFirst());
		((LinkedList<String>) list).addFirst(test);
		System.out.println(((LinkedList<String>) list).getFirst());
		((LinkedList<String>) list).removeFirst();
		System.out.println(((LinkedList<String>) list).getFirst());
		System.out.println("Vector:");
		Vector v=new Vector(4);
		v.add("Test0");
		v.add("Test1");
		v.add("Test0");
		v.add("Test2");
		v.add("Test2");
		
		v.remove("Test0");
		v.remove(0);
		int size=v.size();
		System.out.println("Vector size:"+size);
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
	}

}
