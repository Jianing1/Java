package Excercise;

class Account {
	int balance;

	public Account(int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	int withdraw(int num) {
		// TODO Auto-generated method stub
		if (balance < 0 || balance < num) {
			System.out.println("余额不足，不可取款");
			return 0;
		} else {
			balance -= num;
			return num;
		}

	}

}

class MultiWithDraw extends Thread {
	public int amount;
	Account account;

	public MultiWithDraw(Account account, int num) {
		// TODO Auto-generated constructor stub
		this.account = account;
		this.amount = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (account) {
			String str = Thread.currentThread().getName() + "取款前：" + account.getBalance();
			try {
				sleep(5);
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			System.out.println(str + "取款"+account.withdraw(amount) + "取款后余额为：" + account.getBalance());
		}
		super.run();
	}
}

public class Thread3 {
	public static void main(String[] args) {
		Account a = new Account(100);
		for(int i=0;i<20;i++) {
			new MultiWithDraw(a, 10).start();
		}
		
	}
}
