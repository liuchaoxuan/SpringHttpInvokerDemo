/**
 * 
 */
package com.hpe.invoker.client.service;

import com.hpe.invoker.bean.User;

/**
 * @author kyrie liu
 * @date Dec 23, 2017
 * @time 7:44:01 PM
 * @version 1.0
 */
public interface UserService {
	public User getUserByName(String name);
}
