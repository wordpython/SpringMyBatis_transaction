package com.wordpython.po;

public class Customer{
	private Integer id;
	private String username;
	private Double balance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", balance=" + balance + "]";
	}
	
}