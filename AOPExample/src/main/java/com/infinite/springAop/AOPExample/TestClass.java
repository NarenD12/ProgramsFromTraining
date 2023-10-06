package com.infinite.springAop.AOPExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		// Get BusinessLogic bean object from ApplicationContext instance.
		CommonClass businessLogic = (CommonClass) context.getBean("CommonClass");

		// Call implementBusinessLogic method of BusinessLogic bean.
		System.out.println(businessLogic.display());
	}
}
