package com.thinkxfactor.zomatoplus.models;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
@Entity	
@Table(name="tbl_user")	//creates a table tbl_user and maps the object User class
public class User implements Serializable
{
	@Id //maps variable id to the database as a primary key
	@GeneratedValue  //generated a new id..auto increments
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="name",unique=true)	//maps column with the database
	private String name;	
	
	@Column(name="type")	//maps password with the database
	private String type;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address")
	private String address;
	
	@Column(name="password")
	private String password;

	@Column(name="landmark")
	private String landmark;

	@Column(name="pincode")
	private Integer pincode;
	
	public User()
	{
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long id) {
		this.userId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
	
	
}