package com.infinite.beans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainExample {

	public static void main(String[] args) {

		{
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");

			Address address = (Address) context.getBean("custAddress1");
			System.out.println(address.getDoorNo());
			System.out.println(address.getCity());
			System.out.println(address.getStreetName());
			context.registerShutdownHook();
		}
	}
}
