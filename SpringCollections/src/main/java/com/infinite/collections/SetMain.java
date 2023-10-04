package com.infinite.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetMain {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		SetBean con = (SetBean) context.getBean("settest");
		System.out.println(con.getSt());
		context.registerShutdownHook();
	}
}
