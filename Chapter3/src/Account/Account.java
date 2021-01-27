package Account;

public class Account {
	String name;
	String AccountNumber;
	int currAmount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public int getCurrAmount() {
		return currAmount;
	}

	public void setCurrAmount(int currAmount) {
		this.currAmount = currAmount;
	}

	void deposit(int amount) {
//		int temp=currAmount+amount;
//		setCurrAmount(temp);
		currAmount = currAmount + amount;
	}

	void draw(int amount) {
//		int temp=currAmount-amount;
//		setCurrAmount(temp);
		currAmount = currAmount - amount;
	}

	void Traverse() {
		System.out.println("your name is " + name);
		System.out.println("your accountnumber is " + AccountNumber);
		System.out.println("you have " + currAmount + " yvan");
	}
}
