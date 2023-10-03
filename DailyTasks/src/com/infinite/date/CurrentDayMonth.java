package com.infinite.date;
//Program to display Current day, day of week, Month
import java.util.Date;

public class CurrentDayMonth {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Date date=new Date();
		int day=date.getDate();
		int currentday=date.getDay();
		int month=date.getMonth();
		
		System.out.println("Day of Month: "+day);
		System.out.println("Current day in the Week: "+currentday);
		System.out.println("Current Month: "+(month+1));
	}
}
