package Account;

public class Test {

	public static void main(String[] args) {
		Account a = new Account();
		a.setName("Jianing");
		a.setAccountNumber("1802090181");
		System.out.println("deposit 100 yvan");
		a.deposit(100);
		System.out.println("draw 50 yvan");
		System.out.println("print your personal information:");
		a.draw(50);
		a.Traverse();

	}

}
