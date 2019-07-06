package com.lovo.j163mybatis.bean;

public class KeyBean {
	
	private Integer id;
	
	private String owner;
	//∂‡∂‘“ª
	private LockBean lockBean;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public LockBean getLockBean() {
		return lockBean;
	}

	public void setLockBean(LockBean lockBean) {
		this.lockBean = lockBean;
	}

	@Override
	public String toString() {
		return "KeyBean [id=" + id + ", owner=" + owner + ", lockBean=" + lockBean + "]";
	}
}
