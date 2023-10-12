package org.infinite.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.DistinctRootEntityResultTransformer;
//import org.hibernate.criterion.Restrictions;
import org.infinite.dbutils.HibernateUtil;
import org.infinite.pojo.Student;

public class TestCriteriaClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Transaction tx = null;
		//Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
		try{
//		List<Student> ls= session.createCriteria(Student.class).setFirstResult(1).setMaxResults(20).list();
			List<Student> ls=session.createCriteria(Student.class).setResultTransformer(DistinctRootEntityResultTransformer.INSTANCE).list();
		for(Student z:ls){
			System.out.print(z.getStudentId()+" ");
			System.out.print(z.getFirstName()+" ");
			System.out.print(z.getLastName()+" ");
			System.out.print(z.getRollNo()+" ");
			System.out.println("");
		}
		
		}catch (HibernateException e) {
			if(tx!=null){
				//Roll back if any exception occurs. 
				tx.rollback();
			}
			e.printStackTrace(); 
		}finally {
			//Close hibernate session.
			session.close(); 
		}
	}		
}
