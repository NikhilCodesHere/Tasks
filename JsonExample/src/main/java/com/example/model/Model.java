package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "json")
public class Model {
	
	@Id
	@Column(name = "date_")
	private String date;
	@Column(name = "localName")
	private String localName;
	@Column(name = "name_")
	private String name;
	@Column(name = "countryCode")
	private String countryCode;
	@Column(name = "fixed")
	private String fixed;
	@Column(name = "global_")
	private String global;
	@Column(name = "countries")
	private String countries;
	@Column(name = "launchyear")
	private String launchyear;
	@Column(name = "type_")
	private String type;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getFixed() {
		return fixed;
	}

	public void setFixed(String fixed) {
		this.fixed = fixed;
	}

	public String getGlobal() {
		return global;
	}

	public void setGlobal(String global) {
		this.global = global;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	public String getLaunchyear() {
		return launchyear;
	}

	public void setLaunchyear(String launchyear) {
		this.launchyear = launchyear;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Model(String date, String localName, String name, String countryCode, String fixed, String global,
			String countries, String launchyear, String type) {

		this.date = date;
		this.localName = localName;
		this.name = name;
		this.countryCode = countryCode;
		this.fixed = fixed;
		this.global = global;
		this.countries = countries;
		this.launchyear = launchyear;
		this.type = type;
	}

	public Model() {

	}

}
