package Example;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple("红富士", 2.1, "山东");
		apple.appleInfo();
		apple.fruitInfo();
		System.out.println("tag info:" + apple.tag);
		System.out.println("tag info:" + ((Fruit) apple).tag);
	}

}

class Fruit {
	public String tag = "这是一个水果！";
	private double weight;
	private String name;

	public Fruit(String name) {
		this.name = name;
	}

	public Fruit(String name, double weight) {
		this(name);
		this.weight = weight;
	}

	public void fruitInfo() {
		System.out.println("这个水果的质量为：" + weight);

	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Apple extends Fruit {
	public String tag = "这是一个苹果！";
	private String place;

	public Apple(String name, double weight, String place) {
		super(name, weight);
		this.place = place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPlace() {
		return place;
	}

	public void appleInfo() {
		System.out.println("苹果的重量：" + super.getWeight());
		System.out.println("苹果的名称：" + super.getName());
		System.out.println("苹果的产地：" + this.getPlace());
	}
}
