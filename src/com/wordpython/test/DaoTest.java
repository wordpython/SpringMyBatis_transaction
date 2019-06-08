package com.wordpython.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wordpython.dao.CustomerDao;
import com.wordpython.po.Customer;
import com.wordpython.service.CustomerService;

public class DaoTest {
	@Test
	public void findCustomerByNameTest() {
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao=act.getBean(CustomerDao.class);
		Customer customer = customerDao.findCustomerByName("Jack");
		System.out.println(customer);
	}
	
	@Test
	public void insertCustomerServiceTest() {
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = act.getBean(CustomerService.class);
		Customer customer=new Customer();
		customer.setId(1);
		customer.setUsername("word");
		customer.setBalance(888.9);
		int rows = customerService.insertCustomer(customer);
		if(rows>0) {
			System.out.println("成功插入了"+rows+"条数据！");
		}else {
			System.out.println("执行插入操作失败！！！");
		}
	}
	@Test
	public void deleteCustomerServiceByNameTest() {
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = act.getBean(CustomerService.class);
		int rows = customerService.deleteCustomerByName("word");
		if(rows>0) {
			System.out.println("成功删除了"+rows+"条数据");
		}
		else {
			System.out.println("执行删除操作失败");
		}
	}
}
