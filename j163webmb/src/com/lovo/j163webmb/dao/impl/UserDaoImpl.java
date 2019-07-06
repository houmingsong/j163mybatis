package com.lovo.j163webmb.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lovo.j163webmb.bean.UserBean;
import com.lovo.j163webmb.mapper.UserMapper;
import com.lovo.j163webmb.util.DBUtil;

public class UserDaoImpl {
	
	private static void getAllUsers() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			UserMapper userMapper = session.getMapper(UserMapper.class);
			
			List<UserBean> userList = userMapper.getAllUsers();
			
			for (UserBean userBean : userList) {
				System.out.println(userBean);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	private static void getUserById() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			UserMapper userMapper = session.getMapper(UserMapper.class);
			
			UserBean userBean = userMapper.getUserById(5);
			
			System.out.println(userBean);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	private static void getAllUsersByCondition() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			UserMapper userMapper = session.getMapper(UserMapper.class);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("username", "ÕÅÈý");
			map.put("account", 1);
			
			List<UserBean> userList = userMapper.getAllUsersByCondition(map);
			
			for (UserBean userBean : userList) {
				System.out.println(userBean);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	private static void getAllUsersByName() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			UserMapper userMapper = session.getMapper(UserMapper.class);
			
			List<UserBean> userList = userMapper.getAllUsersByName("Èý");
			
			for (UserBean userBean : userList) {
				System.out.println(userBean);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public static void main(String[] args) {
//		getAllUsers();
//		getUserById();
//		getAllUsersByCondition();
		getAllUsersByName();
	}

}
