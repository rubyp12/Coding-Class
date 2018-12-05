/**
 * 
 */
package com.jp.mtm.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Administrator
 *
 */
@Entity 
@Table(name="ORDER_MTM")
public class Order {
	@Id
	@Column(name = "order_id")
	private Long orderId;
	
	@Temporal(TemporalType.DATE) // required for Date and Calendar Types
	@Column(name = "order_date")
	private Date purchaseDate;
	//Step 1:
	@ManyToMany(cascade=CascadeType.ALL)
	//Step 2: joinTable
	@JoinTable(name="ORDER_PRODUCT_MTM",
	//Step 3: join columns
	joinColumns={@JoinColumn(name="ORDER_ID")},
	//Step 4: InverseJoinColumns
	inverseJoinColumns= {@JoinColumn(name="PRODUCT_ID")})
	private Set<Product> products = new HashSet<>();
	
	
	public Order(Long orderId, Date purchaseDate, Set<Product> products) {
		super();
		this.orderId = orderId;
		this.purchaseDate = purchaseDate;
		this.products = products;
	}

	public Order() {
		
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", purchaseDate=" + purchaseDate + ", products=" + products + "]";
	}
	
	
	
	
	
	

	

}
