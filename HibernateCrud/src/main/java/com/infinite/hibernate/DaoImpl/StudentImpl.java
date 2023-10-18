package com.infinite.hibernate.DaoImpl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.infinite.hibernate.DaoInterface.InterfaceStudent;
import com.infinite.hibernate.daohelper.DaoHelper;
import com.infinite.hibernate.pojo.Student;
import com.mysql.cj.protocol.Resultset;

public class StudentImpl implements InterfaceStudent {

	Session sessionObj;
	SessionFactory sessionFactoryObj = null;

	public void createRecord(String sname,String rno,String course) {
		try {
			// Getting Session Object From SessionFactory
			sessionObj = DaoHelper.buildSessionFactory().openSession();
			// Getting Transaction Object From Session Object
			sessionObj.beginTransaction();
			Student st = new Student();
			st.setStudentName(sname);
			st.setRollNumber(rno);
			st.setCourse(course);
			sessionObj.save(st);
			sessionObj.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}
	 public List<Student> displayRecords() {
		 List<Student> ls= new ArrayList<Student>();
		 try{
		 sessionObj=DaoHelper.buildSessionFactory().openSession();
		 sessionObj.beginTransaction();
		 ls=sessionObj.createQuery("from Student").list();
		 for(Student z:ls){
		 System.out.println(z.getId()+" "+z.getStudentName()+" "+z.getRollNumber()+" "+z.getCourse());
		 }
		 sessionObj.getTransaction().commit();

	}
		 catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 sessionObj.close();
		 }
		 return ls;
	 }
	
	 public void deleteAllRecords() {
		 try{
			 sessionObj=DaoHelper.buildSessionFactory().openSession();
			 sessionObj.beginTransaction();
			 Query qt=sessionObj.createQuery("delete from Student");
			 int rowcount= qt.executeUpdate();
			 System.out.println("row affecteds: "+ rowcount);
			// sessionObj.saveOrUpdate(qt);
			 sessionObj.getTransaction().commit();

		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 sessionObj.close();
		 }
	 }

}
