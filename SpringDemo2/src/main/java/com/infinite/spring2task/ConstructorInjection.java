package com.infinite.spring2task;

public class ConstructorInjection {
	private String first;
	private String last;
	ConstructorInjection()
	{
		
	}
	ConstructorInjection(String firstName, String lastName)
	{
		first=firstName;
		last=lastName;
		
	}
	public String displayName(){
		return new String(first).concat(last).toUpperCase();
	}

}
