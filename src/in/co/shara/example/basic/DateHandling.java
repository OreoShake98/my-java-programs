package in.co.shara.example.basic;

import java.util.Calendar;
import java.util.Date;

public class DateHandling {

	public static void main(String[] args) {
		DateHandling handler = new DateHandling();
		System.out.println("Current Time is " + handler.currentTime());
		System.out.println("Current Day of the month is " + handler.todaysDay());
	}
	
	public Date currentTime() {
		return new Date();
	}
	
	public int todaysDay() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.DAY_OF_MONTH);
	}

}
