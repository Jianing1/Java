package Example;

public class 例3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseDriver ud = new UseDriver();
		DBdriver db = new IBMdriver();
		ud.useDriver(db);
	}

}

interface DBdriver {
	void connect();
}

class UseDriver {
	public void useDriver(DBdriver db) {
		db.connect();
	}
}

class IBMdriver implements DBdriver {
	public void connect() {
		System.out.println("IBM Connect");
	}
}