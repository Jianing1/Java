package Example;

public class 例3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table = new Table();
		Purchase p = new Purchase();
		Sell s = new Sell();
		Deposit d = new Deposit(table);
		p.purchase(table, 5);
		d.display();
		s.sell(table, 1);
		d.display();
	}

}

abstract class Goods {
	private static int numGoods = 200;

	public void add(int count) {
		numGoods += count;

	}

	public void remove(int count) {
		numGoods -= count;
	}

	public String show() {
		return "货物" + numGoods;
	}
}

abstract class Furniture extends Goods {
	private static int numFurniture = 100;

	public void add(int count) {
		numFurniture += count;
		super.add(count);
	}

	public void remove(int count) {
		numFurniture -= count;
		super.remove(count);
	}

	public String show() {
		return "家具" + numFurniture + "," + super.show();
	}
}

class Table extends Furniture {
	private static int numTables = 0;

	public void add(int count) {
		numTables += count;
		super.add(count);
		System.out.println("进货：桌子" + count);
	}

	public void remove(int count) {
		numTables -= count;
		super.remove(count);
		System.out.println("销售：桌子" + count);
	}

	public String show() {
		return "桌子" + numTables + "," + super.show();
	}
}

class Purchase {
	public void purchase(Goods goods, int count) {
		goods.add(count);
	}
}

class Sell {
	public void sell(Goods goods, int count) {
		goods.remove(count);
	}
}

class Deposit {
	private Goods goods;

	public Deposit(Goods g) {
		goods = g;
	}

	public void display() {
		System.out.println("库存：" + goods.show());
	}
}
