package Circle;

public class Circle {

	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	double area() {
		double temp = Math.PI * r * r;
		return temp;
	}

	double circumference() {
		double temp = 2 * Math.PI * r;
		return temp;
	}
}
