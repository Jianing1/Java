package Example;

class MultiWithDraw1 extends Thread {
	private Account account;
	private int amount;

	public MultiWithDraw1(Account account, int amount) {
		this.account = account;
		this.amount = amount;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		synchronized (account) {
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
}

public class Exa5 {
	public static void main(String[] args) {
		Account a = new Account(500);
		for (int i = 1; i <= 10; i++) {
			new MultiWithDraw1(a, 10 + i).start();
		}
	}
}
