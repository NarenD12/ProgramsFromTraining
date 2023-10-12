package com.infinite.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.infinite.pojo.Employee;

public class TestEmployeeClass {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session1 = factory.openSession();
		Employee emp1 = (Employee) session1.load(Employee.class, 1);
		System.out.println(emp1.getId() + " " + emp1.getName() + " " + emp1.getSalary());
		session1.close();

		Session session2 = factory.openSession();
		Employee emp2 = (Employee) session2.load(Employee.class, 2);
		System.out.println(emp2.getId() + " " + emp2.getName() + " " + emp2.getSalary());
		session2.close();

//		try {
//			// Start hibernate session.
//			tx = session1.beginTransaction();
//			tx = session2.beginTransaction();
//			// Insert a new student record in the database.
//			session1.save(emp1);
//			session2.save(emp2);
//
//			// Commit hibernate transaction if no exception occurs.
//			tx.commit();
//
//		} catch (HibernateException e) {
//			if (tx != null) {
//				// Roll back if any exception occurs.
//				tx.rollback();
//			}
//			e.printStackTrace();
//		} finally {
//			// Close hibernate session.
//			factory.close();
//			session1.close();
//			session2.close();
//		}
//	}
}}
