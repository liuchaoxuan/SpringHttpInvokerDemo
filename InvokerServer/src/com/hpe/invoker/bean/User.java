/**
 * 
 */
package com.hpe.invoker.bean;

import java.io.Serializable;

/**
 * @author kyrie liu
 * @date Dec 23, 2017
 * @time 11:11:10 AM
 * @version 1.0
 */
public class User implements Serializable{

	private static final long serialVersionUID = 4381855244447060738L;
	public String name;
	public int age;
	public String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
}
