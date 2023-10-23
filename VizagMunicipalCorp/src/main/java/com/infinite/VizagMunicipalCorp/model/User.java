package com.infinite.VizagMunicipalCorp.model;
//Pojo class for necessary details
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "User")
public class User {

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Name")
	@NotEmpty(message="Name cannot be Empty")
	//@Min(value=2,message="Minimum 2 characters needed")
	private String name;
	
	@Column(name = "Password")
	@NotEmpty(message="Password cannot be empty")
	//@Min(value=5,message="Password should be greater than 5 characters")
	private String password;

	public User(){
		
	}
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
