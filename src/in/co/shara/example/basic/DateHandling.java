package in.co.shara.example.basic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateHandling {

	public static void main(String[] args) throws ParseException {
		DateHandling handler = new DateHandling();
		System.out.println("Current Time is " + handler.currentTime());
		System.out.println("Current Day of the month is " + handler.todaysDay());
		Period age = handler.ageYears("29/04/1998");
		System.out.println("Years " + age.getYears() + " Months " + age.getMonths() + " Days " + age.getDays());
	}

	public Date currentTime() {
		return new Date();
	}

	public int todaysDay() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.DAY_OF_MONTH);
	}

	public Period ageYears(String birthDate) throws ParseException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date result =  df.parse(birthDate);
		Calendar birthCal = Calendar.getInstance();
		birthCal.setTime(result);
		Calendar todayCal = Calendar.getInstance();
		LocalDate birth = LocalDate.of(birthCal.get(Calendar.YEAR),
				birthCal.get(Calendar.MONTH) + 1,
				birthCal.get(Calendar.DAY_OF_MONTH));
		LocalDate today = LocalDate.of(todayCal.get(Calendar.YEAR),
				todayCal.get(Calendar.MONTH) + 1,
				todayCal.get(Calendar.DAY_OF_MONTH));
		Period period = Period.between(birth, today);
		return period;
	}
}
