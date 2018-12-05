/**
 * 
 */
package com.jp.otm.client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.jpacrud.util.JPAUtil;
import com.jp.otm.entity.Department;
import com.jp.otm.entity.Employee;

/**
 * @author Administrator
 *
 */
public class OTMClient {
	public static void main(String[] args) {
		// Step 1: Obtain entityManager object
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		//create the object to be persisted
		//--dept obj
		Department department = new Department();
		department.setDeptId(101L);
		department.setDeptName("Sales");
		
		//-emp obj 1
		Employee e1 = new Employee();
		e1.setEmpId(101L);   e1.setEmpName("Zara");  e1.setEmpSal(99.99);
		//set the department of the employee
		e1.setDepartment(department);
		
		
		//-emp obj 2
		Employee e2 = new Employee();
		e2.setEmpId(102L);   e2.setEmpName("Ruby");  e2.setEmpSal(89.99);
		//set the department of the employee
		e2.setDepartment(department);
		
		//-emp obj 3
		Employee e3 = new Employee();
		e3.setEmpId(101L);   e3.setEmpName("Sumit");  e3.setEmpSal(79.99);
		//set the department of the employee
		e3.setDepartment(department);
		
		//create the set of employees and set to the department
		Set<Employee> employees = new HashSet<>();
		//adding the employee obj to the HashSet
		employees.add(e1); employees.add(e2);
		
		//set the employees set in the Department object
		department.setEmployees(employees);
		
		//begin transaction
		entityManager.getTransaction().begin();
		
		//persist the department object
		entityManager.persist(department);
		
		//commit transaction
		entityManager.getTransaction().commit();
		
		//close.em
		entityManager.close();
		
		
		

	}

}
