package com.lovo.j163mybatis.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lovo.j163mybatis.bean.HomeBean;
import com.lovo.j163mybatis.bean.KeyBean;
import com.lovo.j163mybatis.bean.LockBean;
import com.lovo.j163mybatis.bean.StudentBean;
import com.lovo.j163mybatis.bean.TeacherBean;
import com.lovo.j163mybatis.bean.UserBean;
import com.lovo.j163mybatis.mapper.HomeMapper;
import com.lovo.j163mybatis.mapper.KeyMapper;
import com.lovo.j163mybatis.mapper.LockMapper;
import com.lovo.j163mybatis.mapper.StudentMapper;
import com.lovo.j163mybatis.mapper.TeacherMapper;
import com.lovo.j163mybatis.mapper.TeacherMapper2;
import com.lovo.j163mybatis.mapper.UserMapper;
import com.lovo.j163mybatis.util.DBUtil;

public class ManyToMany {
	
	//�����Զ�: ֻ��ͨ��������ʦ˳���ҵ���Ӧ�Ķ��ѧ��
	private static void getTeacherById() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);
			
			TeacherBean teacherBean = teacherMapper.getTeacherById(1);
			
			System.out.println(teacherBean);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	//˫���Զ�: ����ͨ��������ʦ˳���ҵ���Ӧ�Ķ��ѧ����Ҳ���Բ���ѧ���ҵ���Ӧ�Ķ����ʦ
	private static void getStudentById() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
				
			StudentBean studentBean = studentMapper.getStudentById(2);
			
			System.out.println(studentBean);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	private static void getTeacherById2() {
		
		SqlSession session = null;
		
		try {
			session = DBUtil.getSqlSession();
			
			TeacherMapper2 teacherMapper2 = session.getMapper(TeacherMapper2.class);
			
			TeacherBean teacherBean = teacherMapper2.getTeacherById(1);
			
			System.out.println(teacherBean);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	

	public static void main(String[] args) {
//		getTeacherById();
		getTeacherById2();
//		getStudentById();
	}

}
