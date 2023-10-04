package com.infinite.collconst;

import java.util.Set;

public class SetConstBean {

	private Set<String> st;
	
	SetConstBean(Set<String> t){
		st=t;
	}
	public void display(){
		System.out.println(st);
	}
}
