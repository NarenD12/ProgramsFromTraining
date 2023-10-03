package com.infinite.date;
//Program to find Difference between 2 dates
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateDiff {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
	    Date firstDate = sdf.parse("06/24/2023");
	    Date secondDate = sdf.parse("06/30/2023");

	    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);			//Store Diff in Days
	    long diffmins=TimeUnit.HOURS.convert(diffInMillies,TimeUnit.MILLISECONDS );			//Store Diff in Hours

	    System.out.println("Difference in Days: "+ diff);
	    System.out.println("Difference in Hours: "+ diffmins);
	}
}

