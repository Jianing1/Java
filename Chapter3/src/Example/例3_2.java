package Example;

public class 例3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a = new StringBuffer("ok");
		int i;
		i = 5;
		System.out.println("before change a is " + a);
		change(a);
		System.out.println("after change a is " + a);
		System.out.println("before change i is " + i);
		change(i);
		System.out.println("after change i is " + i);
	}

	public static void change(StringBuffer ia) {
		ia.append("ok?");
	}

	public static void change(int li) {
		li = 10;
	}

}
