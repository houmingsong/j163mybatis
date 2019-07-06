package com.lovo.j163mybatis.bean;

import java.util.List;

public class TeacherBean {
	
	private Integer id;
	
	private String name;
	
	private List<StudentBean> studentList;

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

	public List<StudentBean> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentBean> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "TeacherBean [id=" + id + ", name=" + name + "]";
	}
}
