package org.onlineshoppingportal.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Accounts")
public class Account {

	public static final String ROLE_USER = "USER";
	public static final String ROLE_ADMIN = "ADMIN";
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@Column(name="User_Name",length=20,nullable=false)
	private String userName;
	
	@Column(name="Password",length=12,nullable=false)
	private String password;
	
	@Column(name="Confirm_Password",length=12,nullable=false)
	private String confirmPassword;
	
	@Column(name="Active",length=1,nullable=false)
	private boolean active;
	
	@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "User_Role",
    		   joinColumns = @JoinColumn(name = "User_Id"),
    		   inverseJoinColumns = @JoinColumn(name = "Role_Id"))
	private Set<Role> roles;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
