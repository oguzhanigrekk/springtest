package com.osyy.model;

import java.time.LocalDateTime;

public class Users {

	private Long id;
	private String name;
	private String surname;
	private String userName;
	private String mail;
	private LocalDateTime createDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", surname=" + surname + ", userName=" + userName + ", mail="
				+ mail + ", createDate=" + createDate + "]";
	}
	
	
	
}
