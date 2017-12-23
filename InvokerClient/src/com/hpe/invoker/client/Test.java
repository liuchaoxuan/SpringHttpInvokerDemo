/**
 * 
 */
package com.hpe.invoker.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hpe.invoker.bean.User;
import com.hpe.invoker.client.service.UserService;

/**
 * @author kyrie liu
 * @date Dec 23, 2017
 * @time 7:58:38 PM
 * @version 1.0
 */
public class Test {

	/**
	 * @param args
	 * 客户端服务测试类
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		UserService userService = (UserService) ac.getBean("userService");
		User user = userService.getUserByName("kyrie");
		System.out.println(user.toString());
	}
}
