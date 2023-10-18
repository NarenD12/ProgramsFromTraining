package com.infinite.hibernate.test;

import com.infinite.hibernate.DaoImpl.StudentImpl;

public class DeleteTest {

	public static void main(String[] args) {
		StudentImpl impl=new StudentImpl();
		impl.deleteAllRecords();
		
	}

}
