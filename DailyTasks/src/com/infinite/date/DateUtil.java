package com.infinite.date;
//Program to Print Date with Time and Get Local Time of Italy 
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateUtil {
public static void main(String[] args) {
	
	//Date without time 
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	String dateWithoutTime=	sdf.format(new Date());
	System.out.println(dateWithoutTime);
	
	//Local Time of Italy 
	LocalTime t=LocalTime.now(ZoneId.of("Europe/Rome"));
	System.out.println("Current time in Italy is: "+ t);
	}
}
