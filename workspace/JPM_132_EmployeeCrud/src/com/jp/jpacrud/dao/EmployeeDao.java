package com.jp.jpacrud.dao;

import javax.persistence.EntityManager;

import com.jp.jpacrud.entity.Employee;
import com.jp.jpacrud.exception.EmployeeException;
import com.jp.jpacrud.util.JPAUtil;

public class EmployeeDao implements IEmployeeDao {
	//prep work in Dao-> EntityManager Object
	private EntityManager entityManager;
	public EmployeeDao() {
	entityManager= JPAUtil.getEntityManager();
	}
/*(non-Javadoc)
 * @see com.jp.jpacrud.dao.IEmployeeDao#addEmployee(com.jp.jpacrud.entity.Employee)
 */
	@Override
	public Long addEmployee(Employee employee) throws EmployeeException {
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		// TODO Auto-generated method stub
		return employee.getEmployeeId();
	}

}
