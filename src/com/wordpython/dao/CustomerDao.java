package com.wordpython.dao;

import com.wordpython.po.Customer;

public interface CustomerDao {
	//通过账号查找11
	public Customer findCustomerByAccount(Integer id);
	//通过用户名查找
	public Customer findCustomerByName(String username);
	//添加
	public int insertCustomer(Customer customer);
	//删除
	public int deleteCustomerByName(String username);
}
