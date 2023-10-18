package com.infinite.hibernate.test;

import com.infinite.hibernate.DaoImpl.StudentImpl;

public class DisplayTest {

	public static void main(String[] args) {
		StudentImpl impl=new StudentImpl();
		impl.displayRecords();
	}
}
