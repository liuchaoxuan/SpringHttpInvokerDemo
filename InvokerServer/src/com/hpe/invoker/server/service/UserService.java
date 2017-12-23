/**
 * 
 */
package com.hpe.invoker.server.service;

import com.hpe.invoker.bean.User;

/**
 * @author kyrie liu
 * @date Dec 23, 2017
 * @time 11:10:12 AM
 * @version 1.0
 */
public interface UserService {
	public User getUserByName(String name);
}
