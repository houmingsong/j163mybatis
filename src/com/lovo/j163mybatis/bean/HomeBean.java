package com.lovo.j163mybatis.bean;

public class HomeBean {
	
	private Integer id;
	
	private String address;
	
	private LockBean lockBean;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LockBean getLockBean() {
		return lockBean;
	}

	public void setLockBean(LockBean lockBean) {
		this.lockBean = lockBean;
	}

	@Override
	public String toString() {
		return "HomeBean [id=" + id + ", address=" + address + ", lockBean=" + lockBean + "]";
	}
}
