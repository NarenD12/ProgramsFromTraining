package com.infinite.collconst;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetConstMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		SetConstBean con=(SetConstBean) context.getBean("setconst");
		con.display();
		try{
			context.registerShutdownHook();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
