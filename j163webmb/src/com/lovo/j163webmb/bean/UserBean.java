package com.lovo.j163webmb.bean;

public class UserBean {
	
	private Integer id;
	
	private String username;
	
	private String password;
	
	private Integer account;

	public UserBean() {
		
	}
	
	public UserBean(Integer id, String username, String password, Integer account) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", username=" + username + ", password=" + password + ", account=" + account
				+ "]";
	}
	
}
