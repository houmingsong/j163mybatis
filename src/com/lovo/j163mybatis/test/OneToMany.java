package com.lovo.j163mybatis.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lovo.j163mybatis.bean.HomeBean;
import com.lovo.j163mybatis.bean.LockBean;
import com.lovo.j163mybatis.bean.UserBean;
import com.lovo.j163mybatis.mapper.HomeMapper;
import com.lovo.j163mybatis.mapper.LockMapper;
import com.lovo.j163mybatis.mapper.UserMapper;
import com.lovo.j163mybatis.util.DBUtil;

public class OneToMany {
	
	//����һ�Զ�: ֻ��ͨ������lock˳���ҵ���Ӧ�Ķ��key�����ܲ���key�ҵ�lock
	private static void getLockById() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			LockMapper lockMapper = session.getMapper(LockMapper.class);
			
			LockBean lockBean = lockMapper.getLockById(1);
			
			System.out.println(lockBean);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	

	public static void main(String[] args) {
		getLockById();
	}

}
