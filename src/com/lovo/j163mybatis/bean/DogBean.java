package com.lovo.j163mybatis.bean;

public class DogBean extends PetBean {
	
	private int boneNum;

	public int getBoneNum() {
		return boneNum;
	}

	public void setBoneNum(int boneNum) {
		this.boneNum = boneNum;
	}

	@Override
	public String toString() {
		return "DogBean [boneNum=" + boneNum + "]";
	}

}
