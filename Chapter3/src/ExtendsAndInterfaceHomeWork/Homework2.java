package ExtendsAndInterfaceHomeWork;

interface Dbdrive {
	void say();

}

class IBMdriver extends UserDriver implements Dbdrive {

	@Override
	public void say() {
		System.out.println("I am using " + this.getClass().getSimpleName());

	}

}

class Googledriver extends UserDriver implements Dbdrive {

	@Override
	public void say() {
		System.out.println("I am using " + this.getClass().getSimpleName());

	}

}

class UserDriver {
	void say() {
		System.out.println("I am using " + this.getClass().getName());
	}
}

public class Homework2 {

	public static void main(String[] args) {
		UserDriver u1 = new Googledriver();
		u1.say();
		UserDriver u2 = new IBMdriver();
		u2.say();
	}

}
