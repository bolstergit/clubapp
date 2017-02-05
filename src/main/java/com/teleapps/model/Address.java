package com.teleapps.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id", unique = true, nullable = false)
	private int id;

	@Column(name = "unit_no")
	private int unitNo;

	@Column(name = "street_no")
	private int streetNo;

	@Column(name = "street_name")
	private String streetName;

	@Column(name = "suburb")
	private String suburb;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "postcode")
	private int postcode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUnitNo() {
		return unitNo;
	}

	public void setUnitNo(int unitNo) {
		this.unitNo = unitNo;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
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

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

}
