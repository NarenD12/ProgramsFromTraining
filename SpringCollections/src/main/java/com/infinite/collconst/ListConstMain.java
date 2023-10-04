package com.infinite.collconst;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListConstMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		ListConstBean con = (ListConstBean) context.getBean("listconst");
		con.display();
		try {
			context.registerShutdownHook();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
