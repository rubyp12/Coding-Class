/**
 * 
 */
package com.jp.oto.client;

import javax.persistence.EntityManager;

import com.jp.jpacrud.util.JPAUtil;
import com.jp.oto.entities.Address;
import com.jp.oto.entities.Employee;

/**
 * @author Administrator
 *
 */
public class OTOClient {
	
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		//address obj
		Address homeAddress = new Address();
		homeAddress.setAddressId(120L);
		homeAddress.setStreet("MG Road");
		homeAddress.setCity("Pune");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipcode("411017");
//Employee obj
		
		Employee empobj = new Employee();
		empobj.setEmpId(101L);
		empobj.setEmpName("Zara");
		empobj.setEmpSal(99.99);
		
//set address to the empobj
		
		empobj.setAddress(homeAddress);
//now persist the empobj
		em.persist(empobj);
//commit tx
		em.getTransaction().commit();
		em.close();
		
				
	}

}
