package org.infinite.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.dbutils.HibernateUtil;
import org.infinite.pojo.Login;

public class TestClass {

	public static void main(String[] args) {

		Login login = new Login();
		login.setName("Naren");
		login.setPassword("101010");
		Date date=new java.util.Date();
		login.setTimeStamp(new java.sql.Timestamp(date.getTime()));
		
		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			// Start hibernate session.
			tx = session.beginTransaction();

			// Insert a new student record in the database.
			session.save(login);

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
