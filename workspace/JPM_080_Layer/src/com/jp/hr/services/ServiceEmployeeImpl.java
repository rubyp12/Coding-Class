package com.jp.hr.services;

import java.util.ArrayList;

import com.jp.hr.daos.DaoEmployee;
import com.jp.hr.daos.DaoEmployeeImpl;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

/* 	One layer refers to another layer through interface only.
 *	Implementation of the business rule should be done here in absence of BL layer.
 *	This layer will also ensures only custom exception to come out

Features of : 	
	*Only one gateway with preserving privacy of all inner classes.
	* One point for implementing security, transaction managemetn, caching.
	* Multiple interfaces per client to give restricted view of all services.
	* Facade pattern(GoF pattern - Gang of Four).
	* DAO is a JEE pattern.
	* Implemented singleton by creating single object of outermost class.
	* Delegates and controls Cross Cutting Concerns.
	
*/
public class ServiceEmployeeImpl implements ServiceEmployee {	
	
	private DaoEmployee daoEmp; // Here you have to create the reference of DAO Class and create a object of Implemented class.
	
	// Resolving Dependency.
	public ServiceEmployeeImpl() throws HrException {		
		daoEmp = new DaoEmployeeImpl(); // As you have to create the reference of DAO Class and create a object of Implemented class.
	
	}

	@Override
	public ArrayList<Employee> getEmpList() throws HrException {

		return daoEmp.getEmpList();
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
	
		return daoEmp.getEmpDetails(empId);
	}

	@Override
	public boolean joinNewEmployee(Employee emp) throws HrException {
		// TODO Auto-generated method stub
		return daoEmp.insertNewRecord(emp);
	}

	
	

}
