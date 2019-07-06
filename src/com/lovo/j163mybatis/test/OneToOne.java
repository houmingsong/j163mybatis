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

public class OneToOne {
	
	//����һ��һ: ֻ��ͨ������lock˳���ҵ���Ӧ��home�����ܲ���home�ҵ�lock
	private static void getLockById() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			LockMapper lockMapper = session.getMapper(LockMapper.class);
			
			LockBean lockBean = lockMapper.getLockById(2);
			
			System.out.println(lockBean);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	//˫��һ��һ: ����ͨ������lock˳���ҵ���Ӧ��home��Ҳ�ܲ���home�ҵ�lock
	private static void getHomeById() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			HomeMapper homeMapper = session.getMapper(HomeMapper.class);
			
			HomeBean homeBean = homeMapper.getHomeById(2);
			
			System.out.println(homeBean);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	//���ض���Home���ݣ�ÿһ��home���ݶ�����Ҷ�Ӧ��lock����
	private static void getAllHome() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			HomeMapper homeMapper = session.getMapper(HomeMapper.class);
			
			List<HomeBean> homeBeanList = homeMapper.getAllHome();
			
			for(HomeBean homeBean : homeBeanList) {
				System.out.println(homeBean);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public static void main(String[] args) {
//		getLockById();
//		getHomeById();
		getAllHome();
	}

}
