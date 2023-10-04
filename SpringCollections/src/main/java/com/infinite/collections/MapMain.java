package com.infinite.collections;

import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapMain {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		MapBean con = (MapBean) context.getBean("mapexample");
		HashMap<String,String> hp=(HashMap) con.getMp();		
		System.out.println(hp.keySet());		//For separate printing of keys
		System.out.println(hp.values());		//for separate printing of values
		System.out.println(con.getMp());		//for printing together
		
		try{
			context.registerShutdownHook();
			}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
