package com.infinite.log4jexample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example1 {

	private static final Logger logger = Logger.getLogger(Example1.class);
	
	public static void display(){
		logger.info("Hi from Display");
	}
	public void displaynonstatic(){
		try{
			display();
			@SuppressWarnings("unused")
			int a=1/0;
		}
		catch(Exception e){
		logger.error("Display non static");
		}
	}
	{
		logger.info("Unnamed Block");
	}
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");	
		Example1.display();
		Example1 obj=new Example1();
		obj.displaynonstatic();
	}

}
