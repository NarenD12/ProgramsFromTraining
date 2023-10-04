package com.infinite.collconst;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapConstMain {

		public static void main(String[] args) {
			AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
			MapConstBean con = (MapConstBean) context.getBean("mapexamplecons");
			con.display();		//for printing together
			context.registerShutdownHook();
		}
	}
