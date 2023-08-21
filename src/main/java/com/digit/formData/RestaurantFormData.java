package com.digit.formData;



public class RestaurantFormData {
	
	private String userName;
	private String password;
	private String restaurantName;	
	private String managerName;
	private String contactNumber;
	
	private String buildingName;
	private String streetNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
	
	public RestaurantFormData() {
		super();
	}


	public RestaurantFormData(String userName, String password, String restaurantName, String managerName,
			String contactNumber, String buildingName, String streetNo, String area, String city, String state,
			String country, String pincode) {
		super();
		this.userName = userName;
		this.password = password;
		this.restaurantName = restaurantName;
		this.managerName = managerName;
		this.contactNumber = contactNumber;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRestaurantName() {
		return restaurantName;
	}


	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}


	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
		return "RestaurantFormData [userName=" + userName + ", password=" + password + ", restaurantName="
				+ restaurantName + ", managerName=" + managerName + ", contactNumber=" + contactNumber
				+ ", buildingName=" + buildingName + ", streetNo=" + streetNo + ", area=" + area + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	

}
