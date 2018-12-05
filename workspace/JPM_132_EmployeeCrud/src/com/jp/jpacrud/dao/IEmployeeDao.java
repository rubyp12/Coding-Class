package com.jp.jpacrud.dao;

import com.jp.jpacrud.entity.Employee;
import com.jp.jpacrud.exception.EmployeeException;

public interface IEmployeeDao {
	
	public Long addEmployee(Employee employee) throws EmployeeException;

	}
