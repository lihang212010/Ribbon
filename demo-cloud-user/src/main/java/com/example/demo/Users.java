package com.example.demo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@Column
private String username;
@Column
private String name;
@Column
private Integer age;
@Column
private BigDecimal balance;
public void setAge(Integer age) {
	this.age = age;
}
public void setBalance(BigDecimal balance) {
	this.balance = balance;
}
public void setId(Long id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setUsername(String username) {
	this.username = username;
}
public Integer getAge() {
	return age;
}
public BigDecimal getBalance() {
	return balance;
}
public Long getId() {
	return id;
}
public String getName() {
	return name;
}
public String getUsername() {
	return username;
}
}
