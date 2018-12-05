/**
 * 
 */
package com.jp.oto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="ADDRESS_OTO")
public class Address {
	@Id
	@Column(name="ADDRESSS_ID")
	private Long addressId;
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	@Column(name="ADDRESSS_STREET")
	private String street;
	
	@Column(name="ADDRESSS_CITY")
	private String city;
	
	@Column(name="ADDRESSS_STATE")
	private String state;
	
	@Column(name="ADDRESSS_ZIPCODE")
	private String zipcode;
	
	public Long getAddressId() {
		return addressId;
		
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
	
}
