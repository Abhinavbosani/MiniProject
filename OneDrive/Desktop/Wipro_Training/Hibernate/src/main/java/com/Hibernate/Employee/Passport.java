package com.Hibernate.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	@Column(length=10)
	private String passId;
	
//	@OneToOne
//	@JoinColumn(name = "emp_id")
//    @MapsId
//	private Employee emp;
	

	@OneToOne
	
    private EmployeeBean emp;
	
	
	public String getPassId() {
		return passId;
	}

	public void setPassId(String passId) {
		this.passId = passId;
	}

	public EmployeeBean getEmp() {
		return emp;
	}


	public void setEmp(EmployeeBean emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Passport [passId=" + passId + "]";
	}

	
	
}
