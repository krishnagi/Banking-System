package com.revature.entity;

public class AccDetails {


	private int id;
	private String user_name;
	private String phone_no;
	private String address;
	private String aadhar;
	private double balance;

	public AccDetails(String user_name, String phone_no, String address,String aadhar, double opening_balance) {
		super();
	//	this.id = id;
		this.user_name = user_name;
		this.phone_no = phone_no;
		this.address = address;
		this.aadhar = aadhar;
		this.balance = opening_balance;
	}
	
	public AccDetails() {
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccDetails [id :" + id + ", user_name : " + user_name + ", phone_no : " + phone_no +", address : "+address+",aadhar : "+aadhar+", balance : " +balance+"]";
}

}