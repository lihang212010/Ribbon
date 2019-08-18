package com.example.demo;

import java.math.BigDecimal;

public class Users {
private Long id;
private String username;
private String name;
private Integer age;
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
