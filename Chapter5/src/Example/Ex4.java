package Example;

import java.util.Calendar;
import java.util.Date;

public class Ex4 {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("The current time is" + today.toString());
		long currentTime = System.currentTimeMillis();

		Date tomorrow = new Date(currentTime + 24 * 60 * 60 * 1000);
		System.out.println("Tomorrow is " + tomorrow.toString());
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);
		System.out.println("Today is " + year + " " + month + " " + day);
		int week = now.get(Calendar.DAY_OF_WEEK);
		switch (week) {
		case 1:
			System.out.println("Sunday");break;
		case 2:
			System.out.println("Monday");break;
		case 3:
			System.out.println("Tuesday");break;
		case 4:
			System.out.println("Wendesday");break;
		case 5:
			System.out.println("Thursday");break;
		case 6:
			System.out.println("Friday");break;
		case 7:
			System.out.println("Saturday");break;
		}
	}
}
