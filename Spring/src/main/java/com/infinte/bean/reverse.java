package com.infinte.bean;

public class reverse {
	
	private String fullName;
	private int id;
	
	reverse(int id,String fullName)
	{
		this.fullName=fullName;
		this.id=id;
	}
	
	public void display(){
		System.out.println(id + fullName);
	}
}
