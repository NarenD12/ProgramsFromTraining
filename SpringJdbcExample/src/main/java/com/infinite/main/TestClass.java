/**
 * 
 */
package com.infinite.main;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infinite.dao.EmployeeDaoImpl;
import com.infinite.pojo.Employee;

/**
 * @author narend
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("JdbcBeans.xml");
		EmployeeDaoImpl daoImpl = (EmployeeDaoImpl) context.getBean("empDaoImpl");

		Employee employee = new Employee();
		employee.setFirstname("Kamal");
		employee.setLastname("Emi");
		employee.setSalary(2300);

		daoImpl.deleteEmployee(4);
		Employee employee2 = new Employee("Emi", "Jack", 34000);
		Iterator<Employee> It=daoImpl.getAllEmployees().iterator();
		while(It.hasNext()){
			System.out.println(It.next().getEmpId());
			System.out.println(It.next().getFirstname()+" "+It.next().getLastname());
		}

		daoImpl.insertEmployee(employee);
		daoImpl.insertEmployee(employee2);
		//		daoImpl.createTable();
	}

}
