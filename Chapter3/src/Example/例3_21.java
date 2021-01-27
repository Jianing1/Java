package Example;

public class 例3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		Machine m = robot.getMachine();
		m.run();
		robot.run();
	}

}

interface Machine {
	void run();
}

class Person21 {
	void run() {
		System.out.println("run");
	}
}

class Robot extends Person21 {
	private class MachineHeart implements Machine {
		public void run() {
			System.out.println("heart run");
		}
	}

	Machine getMachine() {
		return new MachineHeart();
	}
}