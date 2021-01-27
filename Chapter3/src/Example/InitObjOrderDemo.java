package Example;

public class InitObjOrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father = new Father();
		// Son son = new Son();
		// Father father = new Son();
	}

}

class Father {
	static {
		System.out.println("父类静态初始化块");
	}
	{
		System.out.println("父类初始化块");
	}
	private static int b = 1;

	public Father() {
		System.out.println("调用了父类无参构造器");
	}

	public Father(int b) {
		this.b = b;
		System.out.println("调用了父类的有参构造器");
	}
}

class Son extends Father {
	static {
		System.out.println("子类静态初始化块");
	}
	{
		System.out.println("子类初始化块");
	}
	private static int a = 1;

	public Son() {
		System.out.println("调用子类的无参构造器");
	}

	public Son(int a) {
		this.a = a;
		System.out.println("调用子类的有参构造器");
	}
}
