package com.lovo.j163mybatis.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lovo.j163mybatis.bean.HomeBean;
import com.lovo.j163mybatis.bean.KeyBean;
import com.lovo.j163mybatis.bean.LockBean;
import com.lovo.j163mybatis.bean.PetBean;
import com.lovo.j163mybatis.bean.StudentBean;
import com.lovo.j163mybatis.bean.TeacherBean;
import com.lovo.j163mybatis.bean.UserBean;
import com.lovo.j163mybatis.mapper.HomeMapper;
import com.lovo.j163mybatis.mapper.KeyMapper;
import com.lovo.j163mybatis.mapper.LockMapper;
import com.lovo.j163mybatis.mapper.PetMapper;
import com.lovo.j163mybatis.mapper.StudentMapper;
import com.lovo.j163mybatis.mapper.TeacherMapper;
import com.lovo.j163mybatis.mapper.UserMapper;
import com.lovo.j163mybatis.util.DBUtil;

public class InheritanceTest {
	
	
	@SuppressWarnings("unused")
	private static void getPetById() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			PetMapper petMapper = session.getMapper(PetMapper.class);
			
			PetBean petBean = petMapper.getPetById(3);
			
			System.out.println(petBean);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	

	public static void main(String[] args) {
		getPetById();
	}

}
