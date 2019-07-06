package com.lovo.j163mybatis.mapper;

import java.util.List;
import java.util.Map;

import com.lovo.j163mybatis.bean.UserBean;

public interface UserMapper {
	
	public void addUser(UserBean userBean);
	
	public void deleteUserById(int id);
	
	public void updateUserNameById(String name, int id);
	
	public List<UserBean> getAllUsers();
	
	public List<UserBean> getAllUsersByCondition(Map<String, Object> param);
	
	public List<UserBean> getAllUsersByName(String name);
	
	public UserBean getUserById(int id);
}
