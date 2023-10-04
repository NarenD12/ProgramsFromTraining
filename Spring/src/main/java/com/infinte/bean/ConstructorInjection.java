package com.infinte.bean;

public class ConstructorInjection {

	private String first;
	private String last;
	ConstructorInjection(){
		
	}
	ConstructorInjection(String firstName,String lastName)
	{
		first=firstName;
		last=lastName;
	}
	public String display(){
		return new String(first).concat(last).toUpperCase();
	}
}
