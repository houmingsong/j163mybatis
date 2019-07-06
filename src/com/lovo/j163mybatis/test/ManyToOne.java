package com.lovo.j163mybatis.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lovo.j163mybatis.bean.HomeBean;
import com.lovo.j163mybatis.bean.KeyBean;
import com.lovo.j163mybatis.bean.LockBean;
import com.lovo.j163mybatis.bean.UserBean;
import com.lovo.j163mybatis.mapper.HomeMapper;
import com.lovo.j163mybatis.mapper.KeyMapper;
import com.lovo.j163mybatis.mapper.LockMapper;
import com.lovo.j163mybatis.mapper.UserMapper;
import com.lovo.j163mybatis.util.DBUtil;

public class ManyToOne {
	
	//˫��һ�Զ�: ����ͨ������lock˳���ҵ���Ӧ�Ķ��key��Ҳ�ܲ���key�ҵ���Ӧ��lock
	private static void getKeyById() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			KeyMapper keyMapper = session.getMapper(KeyMapper.class);
			
			KeyBean keyBean = keyMapper.getKeyById(1);
			
			System.out.println(keyBean);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	

	public static void main(String[] args) {
		getKeyById();
	}

}
