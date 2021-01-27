package Exa;

public class Àý4_1 {
	private int month;
	public String season;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void judgeSeason() {
		if (month == 12 || month == 1 || month == 2) {
			season = "Winter";
		}
		else if (month == 3 || month == 4 || month == 5) {
			season = "Spring";
		}
		else if (month == 6 || month == 7 || month == 8) {
			season = "Summer";
		}
		else if (month == 9 || month == 10 || month == 11) {
			season = "Autumn";
		} else{
			season = "no season!";
		}
		System.out.println("Month" + this.month + " belons to " + season);
	}

	public static class test {
		public static void main(String[] args) {
			Àý4_1 e1 = new Àý4_1();
			e1.setMonth(4);
			e1.judgeSeason();
			e1.setMonth(13);
			e1.judgeSeason();
		}

	}

}
