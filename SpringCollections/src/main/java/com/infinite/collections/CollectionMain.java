package com.infinite.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CollectionMain {

		public static void main(String[] args) {
			AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
			CollectionBean con = (CollectionBean) context.getBean("collectiontest");
			System.out.println(con.getLs());
			context.registerShutdownHook();
	}
}
