package com.chainsys.vehiclemanagement;

public class User {
	private String name;
	private long phoneNumber;
	private String address;
	
	public User(String name,long number,String address) {
		this.name=name;
		this.phoneNumber=number;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User Details: [Name=" + name + ", PhoneNumber=" + phoneNumber + ", Address=" + address + "]";
	}
	
}
