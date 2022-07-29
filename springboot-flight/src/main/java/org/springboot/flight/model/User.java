package org.springboot.flight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class User {

	// Data Variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerID")
	private long userId;

	@Column(name = "Name")
	private String userName;

	@Column(name = "CustomerType")
	private String userType;

	@Column(name = "Email")
	private String userEmail;

	@Column(name = "Password")
	private String userPassword;

	@Column(name = "Phone")
	private long userPhone;

	// Data Encapsulation - Getters and Setters
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	// Parameterized Constructor to Inintialize the data variabales
	public User(long userId, String userName, String userType, String userEmail, String userPassword, long userPhone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
	}

	// Default Construtor
	public User() {
		super();

	}

}
