package com.digit.formData;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.digit.entity.Address;

public class CustomerFormData {
	
	private String userName;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String mobileNumber;
	private String email;
	private String password;
	
	private String buildingName;
	private String streetNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
	
	public CustomerFormData() {
		super();
	}


	public CustomerFormData(String userName, String firstName, String lastName, int age, String gender,
			String mobileNumber, String email, String password, String buildingName, String streetNo, String area,
			String city, String state, String country, String pincode) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.buildingName = buildingName;
		this.streetNo = streetNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getBuildingName() {
		return buildingName;
	}


	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}


	public String getStreetNo() {
		return streetNo;
	}


	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
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


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "CustomerFormData [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", password=" + password + ", buildingName=" + buildingName + ", streetNo=" + streetNo + ", area="
				+ area + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	

}
