package com.infinite.log4jtest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4JQuestion {

	private static final Logger logger=Logger.getLogger(Log4JQuestion.class);
	
	public static void display(){
		logger.info("Infinite Computer Solutions");
		logger.info("JavaBackend");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");
		Log4JQuestion.display();

	}

}
