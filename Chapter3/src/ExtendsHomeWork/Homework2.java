package ExtendsHomeWork;

class Transport {
	String name;
	int TypicalSpeed;
}

class Plane extends Transport {
	public Plane(String _name, int _TypicalSpeed) {
		name = _name;
		TypicalSpeed = _TypicalSpeed;
	}
}

class Train extends Transport {
	public Train(String _name, int _TypicalSpeed) {
		name = _name;
		TypicalSpeed = _TypicalSpeed;
	}
}

class Car extends Transport {
	public Car(String _name, int _TypicalSpeed) {
		name = _name;
		TypicalSpeed = _TypicalSpeed;
	}
}

public class Homework2 {

	public static void main(String[] args) {
		Transport t1 = new Plane("Plane", 800);
		Transport t2 = new Plane("Train", 80);
		Transport t3 = new Plane("Car", 60);
		System.out.println(t1.name + "'s TypicalSpeed is " + t1.TypicalSpeed + "km/h");
		System.out.println(t2.name + "'s TypicalSpeed is " + t2.TypicalSpeed + "km/h");
		System.out.println(t3.name + "'s TypicalSpeed is " + t3.TypicalSpeed + "km/h");
	}

}
