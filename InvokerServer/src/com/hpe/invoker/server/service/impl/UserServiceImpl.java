/**
 * 
 */
package com.hpe.invoker.server.service.impl;

import com.hpe.invoker.bean.User;
import com.hpe.invoker.server.service.UserService;

/**
 * @author kyrie liu
 * @date Dec 23, 2017
 * @time 11:10:52 AM
 * @version 1.0
 */
public class UserServiceImpl implements UserService {

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName(name);
		user.setAge(24);
		user.setEmail("kyrie11@boston.com");
		return user;
	}
}
