/**
 * 
 */
package com.jp.otm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="EMP_OTM")
public class Employee implements Comparable<Employee>{
	
	@Id
	@Column(name="EMP_ID")
	private Long empId;
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_SAL")
	private Double empSal;
	
	@ManyToOne
	@JoinColumn(name="DEPT_ID") //NAME OF THE COLUMN WHICH WILL BE CREATED IN EMPLOYEE TABLE
	private Department department;
	//no_args constructor
	//getters and setters
	//toString()

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", department Id=" + department.getDeptId()
				+ "]";
	}



	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId.intValue();// Passing the value
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj.hashCode()==this.hashCode();
	}

	@Override
	public int compareTo(Employee o) {
		//comparing the emp obj with empId
		// 1 id first object is greater
		//-1 if first object is smaller
		//0 if both are equal /*** For sorting
		return (int)(this.empId-o.empId);
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	
	


}
