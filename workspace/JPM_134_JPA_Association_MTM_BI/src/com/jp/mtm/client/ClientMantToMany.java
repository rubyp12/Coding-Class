/**
 * 
 */
package com.jp.mtm.client;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.jpacrud.util.JPAUtil;
import com.jp.mtm.entities.Order;
import com.jp.mtm.entities.Product;

/**
 * @author Administrator
 *
 */
public class ClientMantToMany {
	
	public static void main(String[] args) {
		
		EntityManager em =JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		// first define few products before we place order
	
		Product elecProduct = new Product();
		elecProduct.setProductId(101L);
		elecProduct.setProductName("LED TV");
		elecProduct.setProductPrice(45000.88);
		
		Product beautyProduct = new Product();
		beautyProduct.setProductId(102L);
		beautyProduct.setProductName("Body Lotion");
		beautyProduct.setProductPrice(225.06);
		
		Product babyProduct = new Product();
		babyProduct.setProductId(103L);
		babyProduct.setProductName("Baby Shampoo");
		babyProduct.setProductPrice(370.06);
		
		Product homeProduct = new Product();
		homeProduct.setProductId(104L);
		homeProduct.setProductName("Kitchenware");
		homeProduct.setProductPrice(500.75);
			
		// now create a Hashset of Product and add it into Set
		Set<Product> products = new HashSet<>();
		products.add(elecProduct);
		products.add(beautyProduct);
		products.add(babyProduct);
		products.add(homeProduct);
	//	
		Order firstOrder = new Order ();
		firstOrder.setOrderId(1L);
		firstOrder.setPurchaseDate(new Date());	
		
		Order secondOrder = new Order ();
		secondOrder.setOrderId(2L);
		secondOrder.setPurchaseDate(new Date());
		
		// now create a Hashset of Order and add it into Set
				Set<Order> orders = new HashSet<>();
				orders.add(firstOrder);
				orders.add(secondOrder);
				
				// now set the product Orders
				elecProduct.setOrders(orders);
				beautyProduct.setOrders(orders);
				babyProduct.setOrders(orders);
				homeProduct.setOrders(orders);
				
	//now add product hashset to the order
				firstOrder.setProducts(products);
				
	// now add product hashset to the Order
				secondOrder.setProducts(products);
				
	// save orders using entity manager
				em.persist(firstOrder);
				em.persist(secondOrder);
				
				System.out.println("Added orders along withy the order details to the database.");
				
				em.getTransaction().commit();
				em.close();
	}

}
