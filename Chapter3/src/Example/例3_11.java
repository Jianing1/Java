package Example;

public class 例3_11 extends Father11 {

	protected String name = "儿子属性";

	public String getName() {
		return name;
	}

	public void method() {
		System.out.println("子类方法，对象类型：" + this.getClass());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father11 sample = new 例3_11();
		System.out.println("调用的成员：" + sample.getName());
		sample.method();
	}

}

class Father11 {
	protected String name = "父亲属性";

	public String getName() {
		return name;
	}

	public void method() {
		System.out.println("父亲方法，对象类型：" + this.getClass());
	}
}