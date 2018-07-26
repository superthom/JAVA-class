package com.pms.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pms.model.Users;
import com.pms.service.UserService;

public class TempTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/configure/spring-*.xml");
		UserService dao = (UserService) context.getBean("userService");
		dao.insertOrUpdateUser(new Users("test", "test", "test"));
	}
}
