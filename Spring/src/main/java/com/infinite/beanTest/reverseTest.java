package com.infinite.beanTest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infinte.bean.reverse;


public class reverseTest {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("sample1.xml");
		reverse con = (reverse) context.getBean("reverse");
		con.display();
		context.registerShutdownHook();
	}		
}
