package com.wordpython.service;

import com.wordpython.po.Customer;

public interface CustomerService {
	//添加
	public int insertCustomer(Customer customer);
	//删除
	public int deleteCustomerByName(String username);
}
