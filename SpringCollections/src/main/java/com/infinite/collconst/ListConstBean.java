package com.infinite.collconst;

import java.util.List;

public class ListConstBean {

	private List<String> ls;
	
	ListConstBean(List<String> t){
		ls=t;
	}
	public void display(){
		System.out.println(ls);
	}
	
}
