package com.endpoint.bean;

public class UserInfo {
	
	/**
	 * Username
	 * */
	private String name;
	
	/**
	 * Postal Code
	 * */
	private String postalCode;
	
	/**
	 * City
	 * */
	private String city;
	
	/**
	 * Constructor
	 * @param name String
	 * @param postalCode String
	 * */
	public UserInfo(String name, String postalCode) {
		this.name = name;
		this.postalCode = postalCode;
	}
	
	/**
	 * Constructor
	 * @param name String
	 * @param postalCode String
	 * @param city String
	 * */
	public UserInfo(String name, String postalCode, String city) {
		this.name = name;
		this.postalCode = postalCode;
		this.city = city;
	}

	/**
	 * Getter for name field
	 * @return String
	 * */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name field
	 * @param name String
	 * */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for postalCode field
	 * @return String
	 * */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Setter for postalCode field
	 * @param postalCode String
	 * */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Getter for city field
	 * @return String
	 * */
	public String getCity() {
		return city;
	}

	/**
	 * Setter for city field
	 * @param city String
	 * */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Check if username field and postalCode field are not null and not empty fields
	 * @return boolean (true if both are filled, false in other case)
	 * */
	public boolean validInitInfo(){
		return (name != null && !name.trim().isEmpty()
				&& postalCode != null && !postalCode.trim().isEmpty());
	}
	

}
