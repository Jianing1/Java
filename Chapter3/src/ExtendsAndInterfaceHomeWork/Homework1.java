package ExtendsAndInterfaceHomeWork;

class Transport {
	void say() {

	}
}

class car extends Transport {
	public void say() {
		System.out.println(this.getClass().getSimpleName() + " is working！");
	}
}

class train extends Transport {
	public void say() {
		System.out.println(this.getClass().getSimpleName() + " is working！");
	}
}

class plane extends Transport {
	public void say() {
		System.out.println(this.getClass().getSimpleName() + " is working！");
	}
}

public class Homework1 {

	public static void main(String[] args) {
		Transport p1 = new car();
		p1.say();
		Transport p2 = new train();
		p2.say();
		Transport p3 = new plane();
		p3.say();
	}

}
