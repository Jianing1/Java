package OverLoadMethod;

public class Method {
	public int calculate(int param) {
		return (param + 1);
	}

	public int calculate(int param1, int param2) {
		return (param1 + param2);
	}

	public double calculate(double length, double width) {
		return (length * width);
	}

}
