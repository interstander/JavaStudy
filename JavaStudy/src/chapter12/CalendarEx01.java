package chapter12;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.println("year : "+year);
		System.out.println("month : "+month);
		System.out.println("day : "+day);
		System.out.println("week : "+week);
		System.out.println("amPm : "+amPm);
		System.out.println("hour : "+hour);
		System.out.println("minute : "+minute);
		System.out.println("second : "+second);
	}

}
