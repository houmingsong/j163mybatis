package com.lovo.j163mybatis.bean;

import java.util.List;

public class StudentBean {
	
	private Integer id;
	
	private String name;
	
	private List<TeacherBean> teacherList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TeacherBean> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<TeacherBean> teacherList) {
		this.teacherList = teacherList;
	}

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", teacherList=" + teacherList + "]";
	}

}
