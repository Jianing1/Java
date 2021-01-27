package Example;

public class 例题上转型 {
	public static void main(String args[]) {
		Animal animal_1 = new Dog();
		Animal animal_2 = new Cat();
		Dog dog = (Dog) animal_1;

		animal_1.voice();
		animal_1.selfAnimal();
		System.out.println(animal_1.name);

		System.out.println("---------------------------");

		dog.voice();
		dog.selfAnimal();
		System.out.println(dog.name);

		System.out.println("---------------------------");

	}
}

class Animal {
	protected String name = "Animal属性";

	public void selfAnimal() {
		System.out.println("Animal selfAnimal方法，" + "对象类型：" + this.getClass());
	}

	public void voice() {
		System.out.println("Animal voice方法，" + "对象类型：" + this.getClass());
	}
}

class Dog extends Animal {
	protected String name = "Dog属性";

	public void selfDog() {
		System.out.println("Dog selfDog方法，" + "对象类型：" + this.getClass());
	}

	public void voice() {
		System.out.println("Dog voice方法，" + "对象类型：" + this.getClass());
	}
}

class Cat extends Animal {
	protected String name = "Cat属性";

	public void selfCat() {
		System.out.println("Cat selfCat方法，" + "对象类型：" + this.getClass());
	}

	public void voice() {
		System.out.println("Cat voice方法，" + "对象类型：" + this.getClass());
	}
}