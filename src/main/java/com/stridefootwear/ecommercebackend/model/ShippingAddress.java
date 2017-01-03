package com.stridefootwear.ecommercebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class ShippingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Shipping_id;
	
	@Column
	private String Flat_no;
	
	@Column
	private String Building_name;
	
	@Column
	private String Locality_name;
	
	@Column
	private String Landmark;
	
	@Column
	private String City_name;
	
	@Column
	private String State_name;
	
	@Column
	private String Country_name;
	
	@Column
	private String Zip_code;
	
	@OneToOne(mappedBy= "shippingAddress")
	private User user;
	

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getShipping_id() {
		return Shipping_id;
	}

	public void setShipping_id(int shipping_id) {
		Shipping_id = shipping_id;
	}

	public String getFlat_no() {
		return Flat_no;
	}

	public void setFlat_no(String flat_no) {
		Flat_no = flat_no;
	}

	public String getBuilding_name() {
		return Building_name;
	}

	public void setBuilding_name(String building_name) {
		Building_name = building_name;
	}

	public String getLocality_name() {
		return Locality_name;
	}

	public void setLocality_name(String locality_name) {
		Locality_name = locality_name;
	}

	public String getLandmark() {
		return Landmark;
	}

	public void setLandmark(String landmark) {
		Landmark = landmark;
	}

	public String getCity_name() {
		return City_name;
	}

	public void setCity_name(String city_name) {
		City_name = city_name;
	}

	public String getState_name() {
		return State_name;
	}

	public void setState_name(String state_name) {
		State_name = state_name;
	}

	public String getCountry_name() {
		return Country_name;
	}

	public void setCountry_name(String country_name) {
		Country_name = country_name;
	}

	public String getZip_code() {
		return Zip_code;
	}

	public void setZip_code(String zip_code) {
		Zip_code = zip_code;
	}
	
	
	

}
