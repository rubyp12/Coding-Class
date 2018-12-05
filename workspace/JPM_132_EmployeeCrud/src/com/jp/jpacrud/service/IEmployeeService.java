/**
 * 
 */
package com.jp.jpacrud.service;

import com.jp.jpacrud.entity.Employee;
import com.jp.jpacrud.exception.EmployeeException;

/**
 * @author Administrator
 *
 */
public interface IEmployeeService {
	
	//CRUDS Operation
	public Long addEmployee(Employee employee) throws EmployeeException;

}
