package com.infinite.spring.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aadhar")
public class Aadhar {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String aadharid;
	
	private String name;
	
	private String paddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAadharid() {
		return aadharid;
	}

	public void setAadharid(String aadharid) {
		this.aadharid = aadharid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", aadharid=" + aadharid + ", name=" + name + ", paddress=" + paddress + "]";
	}

	
}
