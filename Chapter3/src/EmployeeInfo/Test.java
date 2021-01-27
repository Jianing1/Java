package EmployeeInfo;

public class Test {

	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo();
		e.setName("Jianing");
		e.setSex("Man");
		e.setBirthDay(29);
		e.setBirthMonth(9);
		e.setBirthYear(2000);
		e.setSalary(10000);
		System.out.println("your name is:" + e.getName());
		System.out.println("you are a :" + e.getSex());
		System.out.println("your birthday is :" + e.getBirthYear() + "." + e.getBirthMonth() + "." + e.getBirthDay());
		System.out.println("your salary is :" + e.getSalary());

	}

}
