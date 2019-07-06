package com.lovo.j163mybatis.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lovo.j163mybatis.bean.UserBean;
import com.lovo.j163mybatis.mapper.UserMapper;
import com.lovo.j163mybatis.util.DBUtil;

public class DynaSQLSelectTest {

	private static void getUserListByChooseWhen() {

		SqlSession session = null;

		try {
			session = DBUtil.getSqlSession();

			UserMapper userMapper = session.getMapper(UserMapper.class);

			UserBean userBeanAsCondition = new UserBean();

			userBeanAsCondition.setAccount(2);

			List<UserBean> userList = userMapper.getUserListByChooseWhen(userBeanAsCondition);

			for (UserBean userBean : userList) {
				System.out.println(userBean);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	private static void updateUserNameAndPwdByCondition() {

		SqlSession session = null;

		try {
			session = DBUtil.getSqlSession();

			UserMapper userMapper = session.getMapper(UserMapper.class);

			Map<String, Object> param = new HashMap<String, Object>();
			param.put("username", "ÕÅÈý");
			param.put("pwd", "abcd");
			param.put("userId", "2");

			userMapper.updateUserNameAndPwdByCondition(param);
			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	private static void getUserListByIdList() {

		SqlSession session = null;

		try {
			session = DBUtil.getSqlSession();

			UserMapper userMapper = session.getMapper(UserMapper.class);

			List<Integer> idList = new ArrayList<Integer>();
			idList.add(1);
			idList.add(2);
			idList.add(3);

			List<UserBean> userList = userMapper.getUserListByIdList(idList);
			for (UserBean userBean : userList) {
				System.out.println(userBean);
			}
			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public static void main(String[] args) {
		// getUserListByChooseWhen();
		// updateUserNameAndPwdByCondition();
		getUserListByIdList();

	}

}
