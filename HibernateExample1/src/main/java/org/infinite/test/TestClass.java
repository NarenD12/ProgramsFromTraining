package org.infinite.test;

import java.util.concurrent.ThreadLocalRandom;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.dbutils.HibernateUtil;
import org.infinite.pojo.Student;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		Student student = null;
		int random=ThreadLocalRandom.current().nextInt();
		// Get the session object.
		try {
			// Start hibernate session.
			tx = session.beginTransaction();
			for (int i = 0; i <= 50; i++) {
				student = new Student();
				student.setFirstName("Yes" + i);
				student.setLastName("S" + i);
				student.setClassName("Btecch");
				student.setRollNo("Bt/07/" + 7456 + i);
				student.setAge(random);
				session.save(student);
				// Commit hibernate transaction if no exception occurs.
			}
			// Commit hibernate transaction if no exception occurs.
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				// Roll back if any exception occurs.
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			// Close hibernate session.
			session.close();
		}
	}
}
