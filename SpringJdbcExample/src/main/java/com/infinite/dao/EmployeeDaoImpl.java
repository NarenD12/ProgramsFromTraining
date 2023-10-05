/**
 * 
 */
package com.infinite.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import com.infinite.helper.EmployeeRowMapper;
import com.infinite.interfaces.IEmployeeDao;
import com.infinite.pojo.Employee;

/**
 * @author narend Implementing the methods from Interface IEmployeeDao
 */
public class EmployeeDaoImpl implements IEmployeeDao {

	private DataSource dataSource=null;
	private JdbcTemplate jdbcTemplate=null;
	private PlatformTransactionManager transactionManager=null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	public void createTable() {

		String sql="create table employee (empid int primary key "
				+ "auto_increment,firstname varchar(25),"
				+ "lastname varchar(25),salary numeric(8,2))";
		jdbcTemplate.execute(sql);
		System.out.println("Table Created");
	}
	public void insertEmployee(Employee employee) {
		String sql="insert into employee(firstname,lastname,salary) "
				+ "values (?,?,?)";
		jdbcTemplate.update(sql, employee.getFirstname(), 
				employee.getLastname(), employee.getSalary());		
		System.out.println("Inserted Record");
	}
	public void deleteEmployee(int employeeId) {
		String sql="delete from employee where empid=?";
		int a=jdbcTemplate.update(sql,new Object[]{employeeId});
		if(a==0){
			System.out.println("Failed to Delete");
		}else{
			System.out.println("Deleted Record");
		}
	}

	public List<Employee> getAllEmployees() {
		String sql="select * from employee";
		List<Employee> employee=jdbcTemplate.query(sql, 
				new EmployeeRowMapper(),new Object[] {});
		System.out.println("Showing all Employees");
		return employee;
	}

	public String findEmployeeName(int empId) {
		// TODO Auto-generated method stub
		System.out.println("Find Employee Name");
		return null;
	}

	public Employee findEmployee(int empId) {
		// TODO Auto-generated method stub
		System.out.println("Find Employee");
		return null;
	}

	public int countEmployees() {
		// TODO Auto-generated method stub
		System.out.println("Count no of Employees");
		return 0;
	}

	public void addbonus(Employee employee, int experience) {
		// TODO Auto-generated method stub
		System.out.println("Bonus for Employee");

	}
}
