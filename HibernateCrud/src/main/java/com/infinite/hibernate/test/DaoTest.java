package com.infinite.hibernate.test;

import java.util.Scanner;

import com.infinite.hibernate.DaoImpl.StudentImpl;

public class DaoTest {	
	
	public static void main(String[] args) {
		StudentImpl impl=new StudentImpl();

		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String sname=sc1.next();
		System.out.println("Enter Student Rollno: ");
		String rno=sc1.next();
		System.out.println("Enter Student Course: ");
		String course=sc1.next();
		impl.createRecord(sname,rno,course);
		
		sc1.close();
		
	}
}
