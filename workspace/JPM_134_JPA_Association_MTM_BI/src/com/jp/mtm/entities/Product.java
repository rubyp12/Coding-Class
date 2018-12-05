/**
 * 
 */
package com.jp.mtm.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="PRODUCT_MTM")
public class Product {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="product_id")
	private Long productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_price")
	private Double productPrice;
	
	//fetch Type
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="products")
	private Set<Order> orders = new HashSet<>();

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(Long productId, String productName, Double productPrice, Set<Order> orders) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", orders=" + orders + "]";
	}
}
/*FetchType.EAGER loading of collections means they are fetched fully
 * at the time their parent is fetched
 * 
 */

