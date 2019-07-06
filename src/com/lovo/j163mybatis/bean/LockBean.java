package com.lovo.j163mybatis.bean;

import java.util.List;

public class LockBean {
	
	private Integer id;
	
	private String type;
	// lock��homeһ��һ��ϵ
	private HomeBean homeBean;
	// lock��keyһ�Զ��ϵ
	private List<KeyBean> keyBeanList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public HomeBean getHomeBean() {
		return homeBean;
	}

	public void setHomeBean(HomeBean homeBean) {
		this.homeBean = homeBean;
	}

	public List<KeyBean> getKeyBeanList() {
		return keyBeanList;
	}

	public void setKeyBeanList(List<KeyBean> keyBeanList) {
		this.keyBeanList = keyBeanList;
	}

	@Override
	public String toString() {
		return "LockBean [id=" + id + ", type=" + type + ", homeBean=" + homeBean + ", keyBeanList=" + keyBeanList
				+ "]";
	}
}
