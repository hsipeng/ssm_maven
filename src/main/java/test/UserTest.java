package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;

public class UserTest {
	@Test
	public void test01(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserService userService =(UserService) context.getBean("userServiceImpl");
		System.out.println(userService.getAllUsers());
	}
}
