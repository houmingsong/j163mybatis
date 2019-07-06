package com.lovo.j163mybatis.test;

import org.apache.ibatis.session.SqlSession;

import com.lovo.j163mybatis.bean.UserBean;
import com.lovo.j163mybatis.mapper.UserMapper;
import com.lovo.j163mybatis.util.DBUtil;

public class UpdateTest {

	public static void main(String[] args) {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			UserMapper userMapper = session.getMapper(UserMapper.class);
			
			userMapper.updateUserNameById("��������", 1);
			
			//�ֶ��ύ�����ݿ�
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
