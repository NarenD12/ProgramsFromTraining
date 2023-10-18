package com.infinite.hibernate.DaoInterface;

import java.util.List;

import com.infinite.hibernate.pojo.Student;

public interface InterfaceStudent {

	public void createRecord(String sname,String rno,String course);
	public List<Student> displayRecords();
	public void deleteAllRecords();
}
