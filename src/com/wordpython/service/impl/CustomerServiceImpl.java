package com.wordpython.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wordpython.dao.CustomerDao;
import com.wordpython.po.Customer;
import com.wordpython.service.CustomerService;
/*
 * 建立service层的目的是，测试类通过service层调用dao,而不是直接调用dao，
 * 因为service可以控制事务回滚，dao不能
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	//注解注入CustomerDao
	@Autowired
	private CustomerDao customerdao;

	@Override
	public int insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return this.customerdao.insertCustomer(customer);
	}

	@Override
	public int deleteCustomerByName(String username) {
		// TODO Auto-generated method stub
		int rows = this.customerdao.deleteCustomerByName(username);
//		int a=1/0;
		return rows;
	}

}
