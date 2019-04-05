package com.cts.policyManagmentSystem.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table
public class User {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private String userId;
	
	@Column(nullable=false,length=50)
	private String firstName;
	
	@Column(nullable=false,length=50)
	private String lastName;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    Date DOB;

	private String gender;
	
	@Column(nullable=false,length=10)
	private int contactNo;
	
	@Column(nullable=false,length=60)
	private String address;
	
	@Column(nullable=false,length=15)
	private String email;
	
	@Column(nullable=false,length=10)
	private String qualification;
	
	@Column(nullable=false,length=10)
	private int salary;
	
	@Column(nullable=false,length=10)
	private String PAN;
	
	@Column(length=10)
	private String employerType;
	
	@Column(length=10)
	private String employer;
	
	@Column(nullable=false,length=50)
	private String hintQuestion;
	
	@Column(nullable=false,length=50)
	private String hintAnswer;
	
	@Column(nullable=false,length=15)
	private String password;
	
	private String userType;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getEmployerType() {
		return employerType;
	}

	public void setEmployerType(String employerType) {
		this.employerType = employerType;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getHintQuestion() {
		return hintQuestion;
	}

	public void setHintQuestion(String hintQuestion) {
		this.hintQuestion = hintQuestion;
	}

	public String getHintAnswer() {
		return hintAnswer;
	}

	public void setHintAnswer(String hintAnswer) {
		this.hintAnswer = hintAnswer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB
				+ ", gender=" + gender + ", contactNo=" + contactNo + ", address=" + address + ", email=" + email
				+ ", qualification=" + qualification + ", salary=" + salary + ", PAN=" + PAN + ", employerType="
				+ employerType + ", employer=" + employer + ", hintQuestion=" + hintQuestion + ", hintAnswer="
				+ hintAnswer + ", password=" + password + ", userType=" + userType + "]";
	}
	
	

	
	
	
}
