package com.infinite.beanTest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infinte.bean.ConstructorInjection;


public class ConstructorInjectionTest {
 
	public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("sample1.xml");
	ConstructorInjection con = (ConstructorInjection) context.getBean("const");
	System.out.println(con.display());
	context.registerShutdownHook();
	}
	
}