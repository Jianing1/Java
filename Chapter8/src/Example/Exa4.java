package Example;

class Account {
	private int balance;

	public Account(int balance) {
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}

	public int GetBalance() {
		return balance;
	}

	public int withDraw(int amount) {
		if (amount < 0) {
			System.out.println("取款金额为负值，不能执行取款操作！");
			return 0;
		} else if (balance < amount) {
			System.out.println("余额不足！不能执行取款操作！");
			return 0;
		} else {
			balance -= amount;
			return amount;
		}

	}
}

class MultiWithDraw extends Thread {
	private Account account;
	private int amount;

	public MultiWithDraw(Account account, int amount) {
		this.account = account;
		this.amount = amount;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		String str = Thread.currentThread().getName() + "取款前余额:" + account.GetBalance();
		try {
			sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println(str + "取款：" + account.withDraw(amount) + "取款后余额：" + account.GetBalance());
	}
}

public class Exa4 {
	public static void main(String[] args) {
		Account a = new Account(500);
		for (int i = 0; i <= 10; i++) {
			new MultiWithDraw(a, 10 + i).start();
		}
	}
}
