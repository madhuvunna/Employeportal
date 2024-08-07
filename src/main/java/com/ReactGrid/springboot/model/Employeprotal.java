package com.ReactGrid.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employePortal")
public class Employeprotal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employeid")
	private int employeId;

	@Column(name = "EmployeName")
	private String employeName;

	@Column(name = "EmployeDesgination")
	private String employeDesgination;

	@Column(name = "EmployeEmail")
	private String employeEmail;

	@Column(name="EmployePhoneNumber")
	private String employePhoneNumber;

	public Employeprotal() {
		
	}

	public Employeprotal(int employeId, String employeName, String employeDesgination, String employeEmail,
			String employePhoneNumber) {
		super();
		this.employeId = employeId;
		this.employeName = employeName;
		this.employeDesgination = employeDesgination;
		this.employeEmail = employeEmail;
		this.employePhoneNumber = employePhoneNumber;
	}

	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public String getEmployeDesgination() {
		return employeDesgination;
	}

	public void setEmployeDesgination(String employeDesgination) {
		this.employeDesgination = employeDesgination;
	}

	public String getEmployeEmail() {
		return employeEmail;
	}

	public void setEmployeEmail(String employeEmail) {
		this.employeEmail = employeEmail;
	}

	public String getEmployePhoneNumber() {
		return employePhoneNumber;
	}

	public void setEmployePhoneNumber(String employePhoneNumber) {
		this.employePhoneNumber = employePhoneNumber;
	}

	@Override
	public String toString() {
		return "Customers [employeId=" + employeId + ", employeName=" + employeName + ", employeDesgination="
				+ employeDesgination + ", employeEmail=" + employeEmail + ", employePhoneNumber=" + employePhoneNumber
				+ "]";
	}

	


	
 
}
